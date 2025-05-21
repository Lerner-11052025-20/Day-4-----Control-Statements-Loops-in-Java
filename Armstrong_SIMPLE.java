public class Armstrong_SIMPLE {
    public static void main(String[] args) {
        for(int n=1 ; n<=1000 ; n++)
        {
            int count=0, copy=n;
            while(copy>0)
                {
                    count++;
                    copy/=10;
                }
            int sum=0 , copy2=n ;
            while(copy2>0)
            {
                int ld = copy2%10;
                int product=1;
                for(int i=1 ; i<=count ; i++)       product *= ld ;
                sum += product;
                copy2 /= 10;
            }
            if(sum == n)System.out.println(n+" --> Armstrong Number");
        }        
    }
}