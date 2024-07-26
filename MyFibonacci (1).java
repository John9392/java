public class MyFibonacci {

    public static void main(String[] args) {
        int[] fibonacci = new int[20];

        fibonacci[0] = 0;
        fibonacci[1] = 1;

        for (int i = 2; i < 20; i++) {
            fibonacci[i] = fibonacci[i - 1] + fibonacci[i - 2];
        }

        for (int i = 0; i < 20; i++) {
            System.out.print(fibonacci[i] + " ");
        }
    }
}