//prime number is a number that is greater than 1 and divide by 1 and itself

import java.util.*;
public class PrimeNo
{
    public void Demo(int num)
    {
        int count = 0;
     
       for(int i =1;i<=num;i++)
      {
         if(num % i==0)
        {
          count++;
        }
     }  
        if(count == 2)
        {
             System.out.println("Number is  prime");
        }
        else
        {
           System.out.println("Number is not prime");
        }
     
    }
    

    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number:");

        int num = sc.nextInt();

        PrimeNo pobj = new PrimeNo();
        pobj.Demo(num);
    }
    
    
}
