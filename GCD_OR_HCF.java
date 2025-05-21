import java.util.Scanner;
public class GCD_OR_HCF    
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();   // GCD --> Greatest Comman Divisor
        int b = sc.nextInt();   // HCF --> Highest Comman Factor

        int minimum = Math.min(a, b);
        int ans=0;
        for(int i=1 ; i<=minimum ; i++)
        {
            if(a%i == 0 && b%i == 0)    ans = i;
        }
        System.out.println("GCD is : "+ans);
    }    
}
