import java.util.Scanner;
public class DoWhile
{
    public static void main(String args[])
    {       
        Scanner sc = new Scanner(System.in);
        
        do
        {
            System.out.print("Enter your number that must be NOT OF THE MULTIPLE OF 10 :- ");
            int n = sc.nextInt();
            if(n%10 == 0)
            {
                System.out.println("you loss the game!!!");
                break;
            }
            System.out.println( "Your entered number is " +n+ " , which is not of the multiple of 10.\nYOU WON THE GAME , YEHHH!!!\nEnter again........ \n");
        }while(true);

        // do
        // {
        //     System.out.println("Enter your number that must bE MULTIPLE OF 10 :- ");
        //     int n = sc.nextInt();
        //     if(n%10 != 0)
        //     {
        //         System.out.println("you loss the game!!!");
        //         break;
        //     }
        //     System.out.println( "Your entered number is " +n+ " , which is multiple of 10. you won!!!\nEnter again :- \n");
        // }while(true);
    }
}
