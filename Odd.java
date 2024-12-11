// Accept a number and print all odd number till that number


import java.util.*;

public class Odd 
{

    public void Demo(int num )
    {

        for(int i = 0; i <= num; i++)
        {
            if(i % 2 != 0)
            {
                System.out.println(i);

            }

        }

    }

    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);

        System.out.print("'Enter the number : ");
        int num = sc.nextInt();

       Odd obj = new Odd();
       obj.Demo(num);

    }
    
}
