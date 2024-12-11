// swapping two numbers

import java.util.*;

public class swap 
{
    public void Demo(int a, int b)
    {
        int temp;
        temp = a;
        a = b;
        b = temp;

        System.out.println(a);
        System.out.println(b);

    }

    

    public static void main(String args[])
    {
         Scanner sc = new Scanner(System.in);

         System.out.print("Enter the first number : " );
         int a = sc.nextInt();

         System.out.print(("Enter the second number :"));
         int b = sc.nextInt();

         

         swap obj = new swap();
         obj.Demo(a, b );

    }
    
}
