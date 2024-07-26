public class DisplayInfo {
    public static void main(String args[]){
        double amount=1234.56789;
        String firstName="john";
        String lastName="prakash";
        int date=3;
        String month="april";
        int year=2002;
        System.out.printf("The amount is $%,.2f%n",amount);
        System.out.printf("My name id %s %s and I was born in %s %d,%d",firstName,lastName,month,date,year);
        System.out.printf("%s %s - %7d%n",firstName,lastName,year);
    }
    
}
