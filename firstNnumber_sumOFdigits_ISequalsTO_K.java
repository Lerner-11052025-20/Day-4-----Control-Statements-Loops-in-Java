import java.util.Scanner;
public class firstNnumber_sumOFdigits_ISequalsTO_K 
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int K = sc.nextInt();

        int count=1 , i=1 ;
        while(count<=N)
        {
            int sum=0 , copy=i;
            while(copy>0)
            {
                sum += (copy%10);
                copy /= 10;
            }
            if(sum == K)
            {
                System.out.print(i+" ");
                count++ ;
            }
            i++ ;
        }
    }    
}
