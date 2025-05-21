public class HelloWorld100 
{
    public static void main(String args[])
    {
        int i = 1;
        while(i <= 100) // i=100        100 <= 100 yes goto inside the loop 
        // now again condition checking 101<=100 no LOOP TERMINATED SUCCESSFULLY
        {
            System.out.println(i + " Hello World!!");       // now i=100 and 100 Hello World!!
            i++;    // now i will become 100++ -----> 101 and checking the condition again 


            //-------------------R_E_M_E_M_B_E_R-------------------
            // jetli vaar print karavvu hoy tetli vaar loop ni under condition ma te n number lakhavano jemke n vaar hoy to ----> i<=n  MUST/SHOUL BE THING IS THAT , KE I=1 THI J i=1 thi j starting
        }
    }    
}
