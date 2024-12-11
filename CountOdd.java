//count odd number in the series

import java.util.*;
public class CountOdd
{
    public void Demo(int num)
    {
      int count=0;

      for(int i=1;i<=num;i++){
        if(i % 2 != 0){
            count++;
        }
      }
      System.out.println("count of odd number is: " + count);
    }

    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
       System.out.print("Enter the number:");

       int num = sc.nextInt();

       CountOdd obj = new CountOdd();
       obj.Demo(num);
    }
    
}
