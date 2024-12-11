/* print pattern

    1 2 3 4 5
    1 2 3 4 5
    1 2 3 4 5
    1 2 3 4 5
    1 2 3 4 5 

 */

 import java.util.*;

public class Pattern1 
{
    public void Demo(int num)
    {
        for(int i  = 1; i <= num; i++)
       {
           

         for(int j = 1; j <= num; j++)
            {
          
             System.out.print(i + " ");
            }

          System.out.println();

        }
}

    public static void main(String[] args) 
    {
         Scanner sc = new Scanner(System.in);
         System.out.print("Enter the number : ");

         int num = sc.nextInt();


       Pattern1 pobj = new Pattern1();
       pobj.Demo(num);

    }
    
}
