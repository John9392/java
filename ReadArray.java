public class ReadArray {
    public static void main(String[] args) {
        // Create a simple array
        int[] simpleArray = {1, 2, 3, 4, 5};
        int indexToRead = 5; // Change this to test different scenarios
        try {
            int value = simpleArray[indexToRead];
            System.out.println("Element at index " + indexToRead + " is: " + value);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Exception caught: " + e.getMessage());
        } finally {
            System.out.println("Operation is complete.");
        }
    }
} 