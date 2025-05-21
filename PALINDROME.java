import java.util.Scanner;
public class PALINDROME 
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your number : " );
        int n = sc.nextInt();

        int r=0,temp=0,orignal=n;
        while(n>0)
        {   
            temp = n%10;
            r *= 10;
            r += temp;
            n /= 10;           
        }
        System.out.println("Your reverse number is "+r);

        if(r == orignal)    System.out.println("Your number is PALINDROME NUMBER");
        else    System.out.println("Your number is NOT palindrome number");
    }    
}
