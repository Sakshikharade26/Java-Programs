//Fibonacci series next number is the sum of previous two number

import java.util.*;
public class Fibonaccie {
    public void Demo(int count){
        int num1 = 0;
        int num2 = 1;
        int sum;
         
        System.out.println(num1 + " "+ num2);

        for(int i =2;i<=count;i++){
           sum = num1 +num2;
           System.out.println(" "+sum );

           num1 = num2;
           num2 = sum;
        }
    }

    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the value of count:");

        int count = sc.nextInt();

        Fibonaccie fobj = new Fibonaccie();
        fobj.Demo(count);
    }
    
}
