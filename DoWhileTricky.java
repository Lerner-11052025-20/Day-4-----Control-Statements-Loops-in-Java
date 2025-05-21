import java.util.Scanner;

public class DoWhileTricky
{
    public static void main(String args[])
    {
        try(Scanner sc = new Scanner(System.in))
        {

            int n,choice;
            int evenSum , oddSum;
            evenSum = oddSum = 0;
    
            do
            {
                System.out.print("Enter your number :- ");
                n = sc.nextInt();
                System.out.println("your entered number is = " +n);
    
                if(n%2 == 0)
                {
                    evenSum += n;
                }
                else
                {
                    oddSum += n;
                }
    
                System.out.print("\nEnter number again......please press....\n1------>continue\n0------>exit\n\nChoice :- ");
                choice = sc.nextInt();
                System.out.println("---------------------------------------------------------------");
            }while(choice==1);
    
            System.out.println("\n----------------ANSWER------------------");
            System.out.println("evenSum = " +evenSum);
            System.out.println("oddSum = " +oddSum);
    
            sc.close();
        }        
    }
}
