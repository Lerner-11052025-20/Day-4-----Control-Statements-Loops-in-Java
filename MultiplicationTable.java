import java.util.Scanner;

public class MultiplicationTable
{
    public static void main(String args[])
    {
        try(Scanner sc = new Scanner(System.in))
        {
            int n = sc.nextInt();
            
            // for(int i=1 ; i<=10 ; i++)
            // {
            //     System.out.println(n+ " * " +i+ " = " +(n*i));            
            // }   
            
            for(int i=1 ; i<=n ; i++)
            {
                System.out.println("Multiplication Table for ------> " +i);
                for(int j=1 ; j<=10 ; j++)
                {
                    System.out.println(i+ " * " +j+ " = " +(i*j));            
                }
                System.out.println("-----------------------------------------------\n\n");
            }        
            sc.close();
        }        
    }
}
