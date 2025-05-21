public class INTEGER_SQUARE_ROOT
{
    public static void main(String args[])
    {
        int n=121 , answer=0;
        for(int i=1 ; (i*i)<=n ; i++)
        {
            answer = i;
        }
        System.out.println(answer);
    }
}