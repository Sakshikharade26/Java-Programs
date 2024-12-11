//Accept the number from user and count the frequency of digits which are less then 6

import java.util.*;

public class Frequency3
{
    public void Demo(int num)
    {
        int count = 0;
        int rem;

        while(num != 0)
        {
           rem = num % 10;
            if(rem <= 6)
                count++;
             num = num /  10;
            
        }
            System.out.println("Frequency of digits is : " + count);
        

    }

    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number : ");
        int num = sc.nextInt();

        Frequency3 fobj = new Frequency3();
        fobj.Demo(num);

    }
    
}
