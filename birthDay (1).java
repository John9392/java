import java.util.Scanner;

class birthDate {
    private int month;
    private int day;
    private int year;

    public birthDate(int month, int day, int year) {
        this.month = month;
        this.day = day;
        this.year = year;
    }

    public String getFormattedDate() {
        return String.format("%02d/%02d/%04d", month, day, year);
    }

    public static boolean isValidDate(int month, int day, int year) {
        if (year <= 1920 || year >= 2020) return false;
        if (month <= 0 || month >= 13) return false;
        if (day <= 0 || day >= 31) return false;
        // Note: This does not account for the different number of days in each month
        // and does not handle leap years. It's a simple validation based on given constraints.
        return true;
    }

    public static boolean isNumeric(String str) {
        try {
            Integer.parseInt(str);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        String input = sc.nextLine();
        String[] details = input.split(",");
        if (details.length != 3 || !isNumeric(details[0]) || !isNumeric(details[1]) || !isNumeric(details[2])) {
            System.out.println("Invalid Input");
            sc.close();
            return;
        }
        
        int month = Integer.parseInt(details[0].trim());
        int day = Integer.parseInt(details[1].trim());
        int year = Integer.parseInt(details[2].trim());
        
        if (!isValidDate(month, day, year)) {
            System.out.println("Invalid Input");
            sc.close();
            return;
        }

        birthDate BirthDate = new birthDate(month, day, year);
        System.out.println("My birthday is: " + BirthDate.getFormattedDate());

        sc.close();
    }
    
 }
