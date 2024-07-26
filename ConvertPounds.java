import java.util.Scanner;

public class ConvertPounds {
        public static double convertIt(double pounds) {
        return pounds * 0.453592;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter weight in pounds: ");
        double pounds = scanner.nextDouble();
        double kg = ConvertPounds.convertIt(pounds);
        System.out.println("The weight in kilograms is: " + kg);
        scanner.close();
    }
}