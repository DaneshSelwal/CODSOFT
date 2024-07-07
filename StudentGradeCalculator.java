import java.util.Scanner;
public class StudentGradeCalculator {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("This is the Grade Calculator, please submit the required details and the calculate the Grade :");
        int totalMarks = 0;
        // Getting input the details
        System.out.println("Enter the name of student: ");
        String name = scanner.nextLine();
        System.out.print("Enter the number of subjects: ");
        int numOfSubjects = scanner.nextInt();
        int[] marks = new int[numOfSubjects];

        // adding marks to an array
        for (int i = 0; i < numOfSubjects; i++) {
            System.out.print("Enter marks for subject " + (i + 1) + ": ");
            marks[i] = scanner.nextInt();
            totalMarks += marks[i];
        }

        // Calculate average percentage
        double averagePercentage = (double) totalMarks / numOfSubjects;

        // Determine grade by if else if
        String grade;
        if (averagePercentage >= 90) {
            grade = "A+";
        } else if (averagePercentage >= 80) {
            grade = "A";
        } else if (averagePercentage >= 70) {
            grade = "B";
        } else if (averagePercentage >= 60) {
            grade = "C";
        } else if (averagePercentage >= 50) {
            grade = "D";
        } else {
            grade = "F";
        }

        // Display results
        System.out.println(String.format("The total marks of %s is: %d" ,name,totalMarks));
        System.out.println("Average percentage marks in each subject: " + averagePercentage + "%");
        System.out.println(String.format("The grade of %s is: %s" ,name,grade));
    }
}
