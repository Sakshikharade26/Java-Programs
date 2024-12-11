/* Print Star pattern
            *
          * *
        * * *
      * * * *
    * * * * *
 */


 import java .util.*;

public class Star3 
{ 
    public void Demo(int num)
    {
        for(int i = 1; i <= num; i++)
        {

            for(int k = i; k <num; k++)
            {
                System.out.print(" ");

            }
            

            for(int j = 1; j <= i; j++)
            {
                System.out.print(" * ");

            }

            System.out.println();
        }
      

    }

    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number : ");
        int num = sc.nextInt();

        Star3 sobj = new Star3();
        sobj.Demo(num);

    }
    
}
