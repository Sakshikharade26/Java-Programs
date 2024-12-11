/*
   print star pattern
     * * * * *
       * * * *
         * * *
           * *
             * 
     

 */

 import java.util.*;

public class star4 
{

    public void Demo(int num)
    {
        for(int i = num; i > 0; i--)
        {
            for(int k = 1; k <= num - i; k++)
            {
              System.out.print(" ");
            }

            for(int j = 1; j <= i - 1; j++)
            {
                System.out.print("* ");
            }

            System.out.println();

        }

    }

    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number : ");
        int num = sc.nextInt();

        star4 sobj = new star4();
        sobj.Demo(num);

    }
    
}
