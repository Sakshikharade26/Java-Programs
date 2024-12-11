//  Eneter the number and print the below pattern number=3 Pattern=> * * * # # #.

import java.util.*;

public class PatternStar 
{
     public void Demo(int num)
    {

        for(int i = 1; i <= num; i++)
        {
            System.out.print("#");
        }


            for(int j = 1; j <=num; j++)
            {
             System.out.print("*");

            }


        

    }

    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter the number : ");
        int num = sc.nextInt();

          PatternStar obj = new PatternStar();

          obj.Demo(num);

        
    }

    
} 


