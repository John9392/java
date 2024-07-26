import java.util.Scanner;
public class ArmstrongNumber{
    public static void main(String args[]){
        int a,b,temp=0;
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        a=n;
        while(a!=0)
        {
            b=a%10;
            temp+=Math.pow(b,3);
            a=a/10;
        }
        if(temp==n)
            System.out.println(n+"is an armstrongnumber");
        else
            System.out.println(n+"is not a armstrong number");
        
    }
}