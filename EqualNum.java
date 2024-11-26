// Accept two number from user and check whether that number is equal

import java.util.*;

public class EqualNum 
{

    public static void main (String args[])
    {
     
        Scanner sc = new Scanner(System.in);

     System.out.print("Enter the first number : ");
     int num1 = sc.nextInt();

     System.out.print("Enter the second number : ");
     int num2 = sc.nextInt();

     if(num1 == num2)
     {
        System.out.println("Both numbers are equal");

     }
     else
     {
        System.out.println("numbers are not equal");

     }

    }
    
}
