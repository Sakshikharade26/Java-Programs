//Palindrome number is a number that same after same

import java.util.*;
 public class Palindrome1
{

    public void Demo( int num)
    {

        int rem;
        int sum=0;
        int temp;

        temp=num;

        while(num > 0){
            rem = num % 10;

            sum = (sum*10)+ rem;

            num = num / 10;
        }

        if(temp == sum)
        {
            System.out.println("Number is palindrome");
        }
        else
        {
            System.out.println("Number is not palindrome");
        }
    }
        public static void main(String args[])
        {
         Scanner sc = new Scanner(System.in);
         System.out.print("Enter the number:");

         int num = sc.nextInt();

         Palindrome1 pobj = new Palindrome1();
          pobj.Demo(num);

        }




}
    

