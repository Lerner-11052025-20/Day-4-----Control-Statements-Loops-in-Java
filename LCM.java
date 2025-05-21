import java.util.Scanner;
public class LCM    
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();   // LCM --> Least Comman Multiple
        int b = sc.nextInt();   

        int minimum = Math.min(a, b);
        int GCD=0;
        for(int i=1 ; i<=minimum ; i++)
        {
            if(a%i == 0 && b%i == 0)    GCD = i;
        }
        System.out.println("GCD is : "+GCD);

        int LCM = (a*b) / GCD ;
        System.out.println("LCM is : "+LCM);
    }    
}
