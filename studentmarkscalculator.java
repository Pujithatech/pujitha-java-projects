
import java.util.Scanner;

public class StudentMarksCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int marks, total = 0;
        double average, percentage;

        System.out.println("=== Student Marks Calculator ===");

        System.out.print("Enter student name: ");
        String name = sc.nextLine();

        for (int i = 1; i <= 5; i++) {
            System.out.print("Enter marks for Subject " + i + ": ");
            marks = sc.nextInt();

            if (marks < 0 || marks > 100) {
                System.out.println("Invalid marks! Enter marks between 0 and 100.");
                sc.close();
                return;
            }

            total += marks;
        }

        average = total / 5.0;
        percentage = (total / 500.0) * 100;

        System.out.println("\n=== Student Result ===");
        System.out.println("Student Name: " + name);
        System.out.println("Total Marks: " + total + " / 500");
        System.out.println("Average Marks: " + average);
        System.out.println("Percentage: " + percentage + "%");

        if (average >= 90) {
            System.out.println("Grade: A+");
        } else if (average >= 80) {
            System.out.println("Grade: A");
        } else if (average >= 70) {
            System.out.println("Grade: B");
        } else if (average >= 60) {
            System.out.println("Grade: C");
        } else if (average >= 40) {
            System.out.println("Grade: D");
        } else {
            System.out.println("Grade: F (Fail)");
        }

        sc.close();
    }
}
