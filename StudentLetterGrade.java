import java.util.Scanner;

class StudentLetterGrade {

    private int studentId;
    private float weeklyPoints;
    private float finalPoints;
    private float finalGrade;
    private String letterGrade;

    public StudentLetterGrade(int studentId, float weeklyPoints, float finalPoints) {
        this.studentId = studentId;
        this.weeklyPoints = weeklyPoints;
        this.finalPoints = finalPoints;
        this.finalGrade = calculateFinalGrade();
        this.letterGrade = determineLetterGrade();
    }

    private float calculateFinalGrade() {
        return this.weeklyPoints + this.finalPoints;
    }

    private String determineLetterGrade() {
        float grade = this.finalGrade;

        if (grade >= 93 && grade <= 100) return "A";
        else if (grade >= 90 && grade < 93) return "A-";
        else if (grade >= 87 && grade < 90) return "B+";
        else if (grade >= 83 && grade < 87) return "B";
        else if (grade >= 80 && grade < 83) return "B-";
        else if (grade >= 77 && grade < 80) return "C+";
        else if (grade >= 73 && grade < 77) return "C";
        else if (grade >= 70 && grade < 73) return "C-";
        else if (grade >= 67 && grade < 70) return "D+";
        else if (grade >= 63 && grade < 67) return "D";
        else if (grade >= 60 && grade < 63) return "D-";
        else return "F";
    }

    public void printStudentDetails() {
        System.out.println("Student ID: " + this.studentId);
        System.out.println("Weekly Points: " + this.weeklyPoints);
        System.out.println("Final Exam Points: " + this.finalPoints);
        System.out.println("Final Grade: " + this.finalGrade);
        System.out.println("Letter Grade: " + this.letterGrade);
    }

    public static boolean isValidPoints(float points) {
        return points >= 0 && points < 50;
    }

    public static boolean isWithinRange(float grade) {
        return grade >= 0 && grade <= 100;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter student ID, weekly points, final points (comma-separated): ");
        String input = sc.nextLine();
        String[] details = input.split(",");

        if (details.length != 3) {
            System.out.println("Invalid Input");
            sc.close();
            return;
        }

        try {
            int studentId = Integer.parseInt(details[0].trim());
            float weeklyPoints = Float.parseFloat(details[1].trim());
            float finalPoints = Float.parseFloat(details[2].trim());
            
            if (!isValidPoints(weeklyPoints) || !isValidPoints(finalPoints)) {
                System.out.println("Invalid Input - Points must be less than 50");
                sc.close();
                return;
            }

            float finalGrade = weeklyPoints + finalPoints;
            if (!isWithinRange(finalGrade)) {
                System.out.println("Invalid Input - Final grade must be within 0 to 100");
                sc.close();
                return;
            }

            StudentLetterGrade student = new StudentLetterGrade(studentId, weeklyPoints, finalPoints);
            student.printStudentDetails();

        } catch (NumberFormatException e) {
            System.out.println("Invalid Input - Incorrect number format");
        }

        sc.close();
    }
}