import java.util.Scanner;
public class series
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of terms : ");
        int n = sc.nextInt();

        int sum=0;
        for(int i=1 ; i<=n ; i++)           //1-2+3-4+5-6+7
        {
            if(i%2 != 0)
            {
                sum += i;
            }
            else
            {
                sum -= i;
            }
        }
        System.out.println("Your sum is : "+sum);
    }
}