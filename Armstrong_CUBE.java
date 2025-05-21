import java.util.Scanner;
public class Armstrong_CUBE
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();

        int copy=a , sum=0 ;
        while(copy>0)
        {
            int temp = copy%10;
            sum += (temp*temp*temp);
            copy /= 10;
        }
        if(sum == a)    System.out.println("Armstrong Number");
        else    System.out.println("Not Armstrong");
    }
}