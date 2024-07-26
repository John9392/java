import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class SearchStrings {
    public static void main(String[] args) {
        String text = "the teacher wore a yellow turtleneck";
        String searchString1 = "nec";
        String searchString2 = "NEC";
        searchAndPrintPositions(text, searchString1);
        searchAndPrintPositions(text, searchString2);
    }

    public static void searchAndPrintPositions(String text, String searchString) {
        Pattern pattern = Pattern.compile(searchString);
        Matcher matcher = pattern.matcher(text);
        if (matcher.find()) {
            int start = matcher.start();
            int end = matcher.end();
            System.out.printf("The string '%s' is found from position %d to %d.%n", searchString, start, end);
        } else {
            System.out.printf("The string '%s' is not found.%n", searchString);
        }
    }
}