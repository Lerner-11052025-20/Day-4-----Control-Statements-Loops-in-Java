public class WhileLoops
{
    public static void main(String args[])
    {

        //------------------------------note that  MARO HETU I NI VALUE PER NATHI MARO FOCUS LOOPS KETLI VAR CHALE TENA PER J CHHEEEEEE......
        int i = 0;
        while(i <= 100) //total 101 var loop running
        {
            i++;    // 100++ 101 loop mathi bhar
        }
        System.out.println(i);
        
        i = 0;
        while(i < 100)  //total 100 var loop running
        {
            i++;    // 99++ 100 loop mathi bhar
        }
        System.out.println(i);
        
        i = 1;
        while(i <= 100) ////total 100 var loop running
        {
            System.out.print(i + " ");
            i++; // 100++ 101 loop mathi bhar
        }
        System.out.println("\n" + i);
        
        i = 1;
        while(i < 100)  //total 99 var loop running
        {
            i++; // 99++ 100 loop mathi bhar 100 < 100 no
        }
        System.out.println(i);
    }
}
