package College;

public class JobScheduling2 {

    public static void main(String[] args) {
        int[] burstTime = {5, 3, 8, 2}; // Burst time of the jobs
        int[] waitingTime = new int[burstTime.length]; // Array to store waiting time
        int totalWaitingTime = 0; // Accumulator for total waiting time

        // Calculate waiting time for each job
        for (int i = 1; i < burstTime.length; i++) {
            waitingTime[i] = burstTime[i - 1] + waitingTime[i - 1];
            totalWaitingTime += waitingTime[i];
        }

        // Calculate average waiting time
        double averageWaitingTime = (double) totalWaitingTime / burstTime.length;

        // Display the results
        System.out.println("Job\tBurst Time\tWaiting Time");
        for (int i = 0; i < burstTime.length; i++) {
            System.out.println((i + 1) + "\t" + burstTime[i] + "\t\t" + waitingTime[i]);
        }
        System.out.println("Average Waiting Time: " + averageWaitingTime);
    }
}
