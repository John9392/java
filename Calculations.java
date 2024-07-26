import java.util.Scanner;

class Calculations {

    public static int computeA() {
        return 21 / 3 + (3 * 9) * 9 + 5;
    }

    public static int computeB() {
        return (17 - 7) * 6 + 2 + 56 - 8;
    }

    public static int computeC() {
        return 10 + 8 * 90 / 9 - 4;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Choose a calculation to perform (A, B, or C): ");
        String choice = sc.nextLine();
        
        switch (choice) {
            case "A":
                System.out.println("Result of 21 ÷ 3 + (3 × 9) × 9 + 5 = " + computeA());
                break;
            case "B":
                System.out.println("Result of (17 - 7) × 6 + 2 + 56 – 8 = " + computeB());
                break;
            case "C":
                System.out.println("Result of 10 + 8 × 90 ÷ 9 – 4 = " + computeC());
                break;
            default:
                System.out.println("Invalid Input");
                break;
        }
        
        sc.close();
    }
}