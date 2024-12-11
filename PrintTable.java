//Accept one number from user and display it'S table on the screen

import java.util.*;
public class PrintTable 
{
    public void Demo(int num){
       int sum =0;
        for(int i = 1; i <= 10 ; i++){
            sum = num *i;
            
        
        System.out.println(num + " * " + i + " = " + sum);
        }
      
    }

    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number:");

        int num = sc.nextInt();

        PrintTable obj = new PrintTable();
        obj.Demo(num);
    }
    
}
