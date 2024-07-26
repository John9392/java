import java.util.Scanner;
public class NameandAge{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter the first name");
        String firstName = scanner.nextLine();
        System.out.println("enter the last name");
        String lastName=scanner.nextLine();
        System.out.println("enter your birth of year");
        int birthYear=scanner.nextInt();
        int totalChar = firstName.length()+lastName.length();
        int currentYear=java.util.Calendar.getInstance().get(java.util.Calendar.YEAR);
        int age=currentYear-birthYear;
        System.out.println("There are " + totalChar + " characters in " + firstName + " " + lastName + "’s name.");
        System.out.println(firstName + " will be " + age + " years old in " + currentYear + ".");
        scanner.close();

    }
}
