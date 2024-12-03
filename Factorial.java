//Accept a number and find its factorial of that number

import java.util.*;

public class Factorial 
{

    public void Demo(int num)
    {
        long Fact = 1;

        for(int i = 1; i <= num; i++)
        {
            Fact = Fact * i;

        }
        System.out.println("Factorial of number is : " + Fact);

    }
    public static void main(String[] args) 
    {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number : ");
         int num = sc.nextInt();

         Factorial obj = new Factorial();
         obj.Demo(num);

        
    }
    
}
