// Accept the number from user and count the frequency of 2

import java.util.*;

public class Frequency4 
{
    public void Demo(int num)
    {
        int count = 0;
        int rem;

        while(num != 0)
        {
            rem = num % 10;

            if(rem == 2)
            
                count++;
                num = num / 10;
            


        }
        System.out.println("Frequency of number 2 is : " + count);

    }
    

    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number : ");

        int num = sc.nextInt();

        Frequency4 fobj = new Frequency4();

        fobj.Demo(num);

    }
}
