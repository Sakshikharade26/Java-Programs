//Armstrong number that is equal to the sum of cubes of digits

import java.util.*;
public class Armstrong1 
{

    public void Demo(int num)
    {
        int sum = 0;
        int rem;
        int temp;

        temp = num;

        while(num > 0)
        {
          rem = num % 10;
          sum = sum + (rem * rem * rem);
          num = num / 10;
        }
        if(temp == sum)
        {
            System.out.println("Number is Armstrong");

        }
        else{
            System.out.println("Number is not Armstrong");
        }

    }

    public static void main(String args[])
    {
       Scanner sc = new Scanner(System.in);
       System.out.print("Enter the number:");

       int num = sc.nextInt();

       Armstrong1 aobj = new Armstrong1();
        aobj.Demo(num);
    }
    
}
