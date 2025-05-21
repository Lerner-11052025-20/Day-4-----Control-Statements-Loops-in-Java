import java.util.Scanner;
public class POWER_OF_2 
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int copy=n;
        while(n>1)
        {
            if(n%2 == 0)    n /= 2;  
            else     break;
        }
        if(n == 1)        System.out.println(copy+" is power of 2");
        else       System.out.println(copy+" is NOT power of 2");
    }    
}
