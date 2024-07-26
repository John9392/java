// StudentLetterGrade2.java
import java.util.Scanner;

public class StudentLetterGrade2 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the student's grade (0-100): ");
        int grade = scanner.nextInt();

        // Validate the grade input
        if (grade < 0 || grade > 100) {
            System.out.println("Invalid grade. Please enter a grade between 0 and 100.");
        } else {
            // Determine the letter grade using a switch statement
            char letterGrade;
            String gradeSuffix = "";

            // Switch based on the tens place of the grade
            switch (grade / 10) {
                case 10:
                    letterGrade = 'A';
                    gradeSuffix = "+";
                    break;
                case 9:
                    letterGrade = 'A';
                    break;
                case 8:
                    letterGrade = 'B';
                    break;
                case 7:
                    letterGrade = 'C';
                    break;
                case 6:
                    letterGrade = 'D';
                    break;
                default:
                    letterGrade = 'F';
                    break;
            }

            // Special handling for a grade of 100
            if (grade == 100) {
                letterGrade = 'A';
                gradeSuffix = "+";
            }

            // Print the letter grade with any suffix
            System.out.println("The student's letter grade is: " + letterGrade + gradeSuffix);
        }

        scanner.close();
    }
}