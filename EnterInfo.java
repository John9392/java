import java.util.Scanner;
class InvalidNameException extends Exception {
    public InvalidNameException(String message) {
        super(message);
    }
}
class InvalidAgeException extends Exception {
    public InvalidAgeException(String message) {
        super(message);
    }
}

public class EnterInfo {
    private String name;
    private int age;

    public void getUserInfo() {
        Scanner scanner = new Scanner(System.in);
        
        while (true) {
            try {
                System.out.print("Enter your name: ");
                name = scanner.nextLine();
                if (name.trim().isEmpty()) {
                    throw new InvalidNameException("Name cannot be blank.");
                }

                System.out.print("Enter your age: ");
                String ageInput = scanner.nextLine();
                try {
                    age = Integer.parseInt(ageInput);
                } catch (NumberFormatException e) {
                    throw new Exception("Age must be a valid integer.");
                }
                
                if (age <= 0 || age > 120) {
                    throw new InvalidAgeException("Age must be between 1 and 120.");
                }

                break;
                
            } catch (InvalidNameException | InvalidAgeException | Exception e) {
                System.out.println(e.getMessage());
            }
        }
        
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        
        scanner.close();
    }

    public static void main(String[] args) {
        EnterInfo enterInfo = new EnterInfo();
        enterInfo.getUserInfo();
    }
}