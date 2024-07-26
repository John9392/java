// DNASwitch.java
import java.util.Scanner;

public class DNASwitch {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        StringBuilder finalString = new StringBuilder();
        int count = 0;

        System.out.println("Please enter 8 DNA nucleotides one by one:");

        while (count < 8) {
            System.out.print("Enter nucleotide " + (count + 1) + ": ");
            String input = scanner.nextLine().trim();

            if (input.length() != 1) {
                System.out.println("Invalid input. Please enter a single character.");
                continue;
            }

            char nucleotide = Character.toUpperCase(input.charAt(0));
            switch (nucleotide) {
                case 'A':
                    System.out.println("A. Adenine");
                    break;
                case 'C':
                    System.out.println("C. Cytosine");
                    break;
                case 'G':
                    System.out.println("G. Guanine");
                    break;
                case 'T':
                    System.out.println("T. Thymine");
                    break;
                default:
                    System.out.println("Other. Unknown");
                    break;
            }

            finalString.append(nucleotide);
            count++;
        }

        System.out.println("Final DNA String: " + finalString.toString());
        scanner.close();
    }
}