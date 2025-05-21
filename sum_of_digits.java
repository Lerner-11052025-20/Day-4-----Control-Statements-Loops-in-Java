import java.util.Scanner;

public class sum_of_digits 
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your number : " );
        int n = sc.nextInt();

        int sum=0,temp=0;
        while(n>0)
        {
            temp = n%10;
            sum += temp;
            n /= 10;
        }

        System.out.println("Your number sum is "+sum);
    }
}
