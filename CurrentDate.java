import java.time.LocalDate;

public class CurrentDate {
    public static void main(String[] args) {
        LocalDate currentDate = LocalDate.now();
        String formattedDate = currentDate.toString();
        System.out.println("The current date is: " + formattedDate);
    }
}