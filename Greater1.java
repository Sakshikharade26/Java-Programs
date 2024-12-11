// Accept one number for user and check whether that number is greater than 100 or not.


import java.util.*;

public class Greater1 
{

    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number : ");
        int num = sc.nextInt();

        if(num > 100)
        {
            System.out.println("Number is Greater than 100 ");

        }
        else
        {
            System.out.println("Number is not greater than 100");

        }


    }
    
}
