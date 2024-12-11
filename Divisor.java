//Find greatest common divisior

import java.util.*;
public class Divisor 
{
    public void Demo(int num1,int num2){

        int Sum = 1;

        for(int i=1 ; i <= num1 && i<=num2 ; i++){
            if(num1 % i == 0 && num2 %i ==0){
                Sum = i;
            }
        }
        System.out.println("Greatest common factor is:"+Sum);

    }

    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
      System.out.print("Enter the number:");

      int num1 = sc.nextInt();
      int num2 =sc.nextInt();

      Divisor dobj = new Divisor();
      dobj.Demo(num1, num2);
    }
    
}
