import java.util.Scanner;
public class PRIME_Factors
{
    public static boolean isprime(int n)
    {
        for(int i=2 ; i<=n-1 ; i++)
        {
            if(n%i == 0)
            {
                return false;
            }
        }
        if(n==0 || n==1)    return false;
        else if(n==2)       return true;
        return true;
    }
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for(int i=1 ; i<=n ; i++)
        {
            if(n%i == 0)
            {
                if(isprime(i) == true)
                {
                    System.out.print(i +" ");
                }
            }
        } 
    }
}