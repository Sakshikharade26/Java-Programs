// Accept a number from user if the number is greater than 10 then print Hello otherwise print Demo

import java.util.*;

public class Greater 
{

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number : ");
        int num = sc.nextInt();


        if(num > 10)
        {
            System.out.println("Hello");
        }
        else
        {
            System.out.println("Demo");

        }

       

    


    }
    
}
