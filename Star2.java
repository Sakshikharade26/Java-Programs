/*  Print star pattern

     * * * * *
     * * * *
     * * *
     * *
     *  
 */

import java.util.*;

public class Star2 
{
    public void Demo(int num)
    {
        for(int i = num; i > 0; i--)
        {
           
            for(int j = 1; j <=  i; j++ )
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

        Star2 obj = new Star2();
        obj.Demo(num);


    }
    
}
