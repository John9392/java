import java.util.Arrays;
public class MyArrays {
    public static void main(String[] args) {
        String[] Bollywood = {"SRK", "Hrithik Roshan", "Salman Khan", "Tiger"};
        System.out.println(Bollywood[0]);
        System.out.println(Bollywood[1]);
        System.out.println(Bollywood[2]);
        System.out.println(Bollywood[3]);
        for (int i = 0; i < Bollywood.length; i++) {
            System.out.println(Bollywood[i]);
        }
        
        // Add an element
        Bollywood = Arrays.copyOf(Bollywood, Bollywood.length + 1);
        Bollywood[Bollywood.length - 1] = "Sushant Singh";
        
        // Search thru an array looking for an element, then print its location
        String searchElement = "Salman Khan";
        for (int i = 0; i < Bollywood.length; i++) {
            if (Bollywood[i].equals(searchElement)) {
                System.out.println(searchElement + " found at index: " + i);
                break;
            }
        }
        
        // Sort and print using FOR LOOP
        Arrays.sort(Bollywood);
        for (int i = 0; i < Bollywood.length; i++) {
            System.out.println(Bollywood[i]);
        }
        
        // Create an int array named Ages
        int[] Ages = {25, 30, 18, 40, 35};
        
        // Print using a FOR LOOP
        for (int i = 0; i < Ages.length; i++) {
            System.out.println(Ages[i]);
        }
        
        // Sort and print using FOR LOOP
        Arrays.sort(Ages);
        for (int i = 0; i < Ages.length; i++) {
            System.out.println(Ages[i]);
        }
    }
}