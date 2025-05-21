import java.util.Scanner;

public class fibonacci_of_givenNUM 
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of term : " );
        int n = sc.nextInt();

        int a=1 , b=1 , sum=1 ;
        for(int i=1 ; i<= n-2 ; i++)
        {
            sum = a+b;
            a = b;
            b = sum;
        }
        System.out.println("Your "+n+"th FIBONACCI term is : "+sum);
    }    
}
