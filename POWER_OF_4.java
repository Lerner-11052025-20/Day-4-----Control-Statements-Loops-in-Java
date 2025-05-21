import java.util.Scanner;
public class POWER_OF_4 
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int copy=n;
        while(n>1)
        {
            if(n%4 == 0)    n /= 4;  
            else     break;
        }
        if(n == 1)        System.out.println(copy+" is power of 4");
        else       System.out.println(copy+" is NOT power of 4");
    }    
}
