import java.util.Scanner;

public class ArmstrongNumber2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Accept number input from user
        System.out.print("Enter a number to check if it's an Armstrong number: ");
        int number = scanner.nextInt();
        
        // Call isArmstrong method and print result
        if (isArmstrong(number)) {
            System.out.println(number + " is an Armstrong number.");
        } else {
            System.out.println(number + " is not an Armstrong number.");
        }

        // Close the scanner
        scanner.close();
    }
    
    // Method to check if a number is an Armstrong number
    public static boolean isArmstrong(int number) {
        // Convert the number to a string to easily access each digit
        String numberStr = Integer.toString(number);
        
        // Calculate the number of digits
        int numDigits = numberStr.length();
        
        int sum = 0;
        
        // Iterate through each digit
        for (int i = 0; i < numDigits; i++) {
            // Get the digit at current position
            int digit = Character.getNumericValue(numberStr.charAt(i));
            
            // Add the digit's power to the sum
            sum += Math.pow(digit, numDigits);
        }
        
        // Check if the sum of the powers is equal to the original number
        return sum == number;
    }
} 
