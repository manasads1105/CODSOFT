package project_1;

import java.util.Scanner;

public class Student_Grade_Calculator {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

        int numSubjects = 5;
        int[] marks = new int[numSubjects];
        int totalMarks = 0;
        double averagePercentage;

        System.out.println("Enter marks for each subject (out of 100):");
        for (int i = 0; i < numSubjects; i++) {
            System.out.print("Subject " + (i + 1) + ": ");
            marks[i] = scanner.nextInt();
            totalMarks += marks[i];
        }

        // Calculate average percentage
        averagePercentage = (double) totalMarks / (numSubjects * 100) * 100;

        // Display total marks and average %
        System.out.println("\nTotal Marks: " + totalMarks);
        System.out.printf("Average Percentage: %.2f%%\n", averagePercentage);

        // Calculating grade based on average %
        String grade;
        if (averagePercentage >= 90) 
        {
            grade = "A+";
        } 
        else if (averagePercentage >= 80) 
       {
            grade = "A";
        }
        else if (averagePercentage >= 70)
        {
            grade = "B";
        } 
        else if (averagePercentage >= 60) 
        {
            grade = "C";
        } 
        else if (averagePercentage >= 50)
        {
            grade = "D";
        } 
        else 
        {
            grade = "Fail";
        }
        System.out.println("The Grade you got is: " + grade);  // Display grade

        scanner.close();
    }
}



	


