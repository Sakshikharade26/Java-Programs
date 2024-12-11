// Accept a number and print all odd numbers till that number

import java.util.*;
public class CalcuOdd {
    public void Demo(int num){

        for(int i = 1; i <= num; i++){
            if(i % 2 != 0){
                System.out.println(i);
            }
        }
    }

    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number:");

        int num = sc.nextInt();

        CalcuOdd obj = new CalcuOdd();
        obj.Demo(num);
    }
    
}
