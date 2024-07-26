import java.util.Scanner;

class Details {
    private String name;
    private int age;
    private double salary;

    public Details(String name, int age, double salary) {
        this.name = name;
        this.age = age;
        this.salary = salary;
    }

    public static boolean isValidName(String name) {
        return name != null && !name.trim().isEmpty() && name.matches("[a-zA-Z ]+");
    }

    public static boolean isValidAge(String age) {
        try {
            int ageNum = Integer.parseInt(age);
            return ageNum > 0 && ageNum < 120;
        } catch (NumberFormatException e) {
            return false;
        }
    }

    public static boolean isValidSalary(String salary) {
        try {
            double salaryNum = Double.parseDouble(salary);
            return salaryNum > 0 && salary.matches("\\d+\\.\\d{1,2}");
        } catch (NumberFormatException e) {
            return false;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        String input = sc.nextLine();
        String[] details = input.split(",");
        
        if (details.length != 3) {
            System.out.println("Invalid Input");
            sc.close();
            return;
        }
        
        String name = details[0].trim();
        String age = details[1].trim();
        String salary = details[2].trim();
        
        if (!isValidName(name) || !isValidAge(age) || !isValidSalary(salary)) {
            System.out.println("Invalid Input");
            sc.close();
            return;
        }
        
        int ageNum = Integer.parseInt(age);
        double salaryNum = Double.parseDouble(salary);
        
        Details detail = new Details(name, ageNum, salaryNum);
        System.out.println("Input was successful.");
        
        sc.close();
    }
}