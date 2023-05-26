package College;


public class JobScheduling {
    static class Job {
        int id;
        int deadline;
        int profit;

        Job(int id, int deadline, int profit) {
            this.id = id;
            this.deadline = deadline;
            this.profit = profit;
        }
    }

    public static void scheduleJobs(Job[] jobs, int maxDeadline) {
        int[] result = new int[maxDeadline];
        boolean[] slot = new boolean[maxDeadline];

        for (int i = 0; i < maxDeadline; i++) {
            slot[i] = false;
        }

        for (int i = 0; i < jobs.length; i++) {
            for (int j = Math.min(maxDeadline - 1, jobs[i].deadline - 1); j >= 0; j--) {
                if (!slot[j]) {
                    result[j] = i;
                    slot[j] = true;
                    break;
                }
            }
        }

        System.out.println("Job Schedule:");
        int totalProfit = 0;
        for (int i = 0; i < maxDeadline; i++) {
            if (slot[i]) {
                Job job = jobs[result[i]];
                totalProfit += job.profit;
                System.out.println("Job ID: " + job.id + ", Deadline: " + job.deadline + ", Profit: " + job.profit);
            }
        }
        System.out.println("Total Profit: " + totalProfit);
    }

    public static void main(String[] args) {
        // Create job instances
        Job job1 = new Job(1, 4, 70);
        Job job2 = new Job(2, 1, 80);
        Job job3 = new Job(3, 2, 50);
        Job job4 = new Job(4, 1, 10);
        Job job5 = new Job(5, 3, 60);

        // Define the maximum deadline
        int maxDeadline = 4;

        // Define the array of jobs
        Job[] jobs = {job1, job2, job3, job4, job5};

        // Schedule the jobs
        scheduleJobs(jobs, maxDeadline);
    }
}
