import java.util.Scanner;

public class a_raised_b
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the first number : ");
        int a = sc.nextInt();
        System.out.print("Enter the second number : ");
        int b = sc.nextInt();

        int product=1;
        for(int i=1 ; i<=b ; i++)
        {
            product = product * a;
        }
        System.out.println(a+"^"+b+" = "+product);
    }
}