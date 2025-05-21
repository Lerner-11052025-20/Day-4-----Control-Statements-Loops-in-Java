public class PrintReverse
{
    public static void main(String args[])
    {
        int n=123455677;
        System.out.println(n);

        int r=0;
        while(n>0)
        {
            int ld = n%10;
            r = r*10 + ld; 
         
            n/=10;
        }
        System.out.println(r);

    }
}
