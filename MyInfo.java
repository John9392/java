import java.util.Scanner;
public class MyInfo{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        String firstname=sc.next();
        String Lastname=sc.next();
        int age=sc.nextInt();
        sc.nextLine();
        String city=sc.nextLine();
        if(!firstname.matches("[a-zA-Z]+")||!Lastname.matches("[a-zA-Z]+")||age<=1||age>=100||!city.matches("[a-zA-Z]"))
        {
            System.out.println("Invalid input");
        }
        else{
            System.out.println("My name is"+firstname+" "+Lastname);
            System.out.println("I am "+age+"years old and was born in"+city);
        }
        sc.close();
    }
}