// import java.util.Scanner;
public class ARMSTRONG_1_to_500
{
    public static void main(String args[])
    {
        // Scanner sc = new Scanner(System.in);
        // System.out.print("Enter your number : ");
        // int n = sc.nextInt();

            //*************************    BAKI CHHE BAKI CHHE BAKI CHHE 
        
        for(int i=1 ; i<=500 ; )
        {
            boolean flag = false;
            int orignal=i , temp=0 , sum=0 , cube=1;
            while(i>0)
            {
                temp = i%10;
                cube = (temp*temp*temp) ;
                sum += cube;
                i /= 10;
            }
            if(sum == orignal)
            {
                flag = true;
                System.out.println("Your entered number "+orignal+" is an ARMSTRONG number");
            }
            else
            {
                System.out.println("Your entered number "+orignal+" is NOT ARMSTRONG number");
            }
            i++;
        }

        
        
    }    
}
