package Generics;

public class Main {
    public static void main(String[] args) {
        Student s1 = new Student(1);
        Student s2 = new Student(2);

        if (s1.roll < s2.roll){
            System.out.println("s2 is greater");
        }
    }
}
