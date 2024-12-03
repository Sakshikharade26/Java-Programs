//Accept two numbers from user and print frist number on the screen second number times.

import java.util.*;

public class PrintNumber {

    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the first number : ");
        int FirstNumber = sc.nextInt();

        System.out.print("Enter the second number : ");
        int SecondNumber = sc.nextInt();


        for(int i = 0; i < SecondNumber; i++  )
        {
         
            System.out.println(FirstNumber);
        }

    }
    
}
