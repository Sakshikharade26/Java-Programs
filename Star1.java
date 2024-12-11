//print a star pattern 
/*
       *
       * * 
       * * * 
       * * * *
       * * * * * 
 */

import java.util.*;

public class Star1
{
   
    public void demo(int num)
    {
        for(int i = 1; i <= num; i++)
        {
            for(int j = 1; j <= i; j++)
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

        Star1 sobj = new Star1();
        sobj.demo(num);
        

    }

}