import java.util.Scanner;

public class Factorial
{
    public static void main(String args[])
    {
        try(Scanner sc = new Scanner(System.in))
        {
            int n = sc.nextInt();
            int product=1;
            
            for(int i=1 ; i<=n ; i++)
            {
                product*=i;
                System.out.println(i+ "! = " +product);            
            }
            // System.out.println(n+ "! = " +product);            
            sc.close();
        }        
    }
}
