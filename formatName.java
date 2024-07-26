import java.util.Scanner;
public class formatName{
    public static void main(String args[]){
        Scanner scanner=new Scanner(System.in);
        // Assume name in format FIRST.MIDDLE.LAST (no spaces) separated by ‘.’
        String inputName = scanner.nextLine();
        String[] nameParts=inputName.split("\\.");
        if(nameParts.length!=3)
        {
            System.out.println("invalid input");
            return;
        }
        String firstName=nameParts[0];
        String middleName=nameParts[1];
        String lastName=nameParts[3];
        char middleInitial = middleName.charAt(0);
        String formattedName = lastName + ", " + firstName + " " + middleInitial + ".";
        System.out.println("Formatted Name: " + formattedName);
    }
}