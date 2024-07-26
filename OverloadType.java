public class OverloadType {

    public static int sum(int a, float b) {
        float result = a + b;
        int roundedResult = Math.round(result);
        System.out.println("The rounded sum is: " + roundedResult);
        return roundedResult;
    }

    public static String sum(String str, int times) {
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < times; i++) {
            result.append(str).append(" ");
        }
        String resultString = result.toString().trim();
        System.out.println("The result is: " + resultString);
        return resultString;
    }

    public static void main(String[] args) {
        sum(10, 3.6f); 
        sum(5, 7.2f); 
        sum("SampleString", 3); 
        sum("Hello", 5);        
    }
}