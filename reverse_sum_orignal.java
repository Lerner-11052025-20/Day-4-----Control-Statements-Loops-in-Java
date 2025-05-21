import java.util.Scanner;
public class reverse_sum_orignal
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your number : " );
        int n = sc.nextInt();

        int r=0, temp=0, orignal=n ;
        while(n>0)
        {   
            temp = n%10;
            r *= 10;
            r += temp;
            n /= 10;           
        }
        System.out.println("Your enterd number is : "+orignal);
        System.out.println("Your reverse number is "+r);

        int sumr = orignal + r;
        System.out.println("Your answer is : "+orignal+" + "+r+" = "+sumr);
    }  
}
