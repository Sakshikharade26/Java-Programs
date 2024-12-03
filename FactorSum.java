// Accept a number and display its summation factor.

import java.util.*;

public class FactorSum 
{

    public void Demo(int num)
    {
         int sum = 0;
        
        for(int i = 1; i <= num; i++)
        { 
            if(num % i == 0)
            {
           
             System.out.println(i);
             sum = sum + i;

             

            }
            
        }
          System.out.println( "Sum of factors is : " + sum);
            

            



    }

    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number : ");
        int num = sc.nextInt();

        

        FactorSum obj = new FactorSum();

        obj.Demo(num);




        
    }
    
}
