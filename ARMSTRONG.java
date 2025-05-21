import java.util.Scanner;
public class ARMSTRONG
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your number : ");
        int n = sc.nextInt();

        int orignal=n , temp=0 , sum=0 , cube=1;
        while(n>0)
        {
            temp = n%10;
            cube = (temp*temp*temp) ;
            sum += cube;
            n /= 10;
        }
        if(sum == orignal)
        {
            System.out.println("Your entered number "+orignal+" is an ARMSTRONG number");
        }
        else
        {
            System.out.println("Your entered number "+orignal+" is NOT ARMSTRONG number");
        }
    }    
}
