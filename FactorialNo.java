// Accept one number from user and find its factorial

import java.util.*;
public class FactorialNo {
    public void Demo(int num){
        
       int  fact = 1;

        for(int i = 1; i <= num; i++){
            {
                fact = fact*i; 
            }
    
          System.out.println("Factorial of " + num +" " + "is: "+ fact);
        }

       
    }

    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number: ");

        int num = sc.nextInt();

        FactorialNo obj = new FactorialNo();
        obj.Demo(num);
    }
    
}
