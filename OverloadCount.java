public class OverloadCount {
    public static int find(int a, int b, int c, int d) {
        int largest = Math.max(Math.max(a, b), Math.max(c, d));
        System.out.println("The largest number is: " + largest);
        return largest;
    }

    public static int find(int a, int b, int c) {
        int smallest = Math.min(Math.min(a, b), c);
        System.out.println("The smallest number is: " + smallest);
        return smallest;
    }

    public static double find(int a) {
        double sqrt = Math.sqrt(a);
        double roundedSqrt = Math.round(sqrt * 10.0) / 10.0;
        System.out.println("The square root of " + a + ", rounded to one decimal place, is: " + roundedSqrt);
        return roundedSqrt;
    }

    public static void main(String[] args) {
        find(10, 20, 30, 40); 
        find(5, 3, 8); 
        find(16); 
        find(27); 
    }
}