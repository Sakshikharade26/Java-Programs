//Armstrong anaumber - is a number that is equal to the sum of cubes of its digits.
import java.util.*;
public class Armstrong {
    
    public void Demo(int num){

       int rem;
       int sum = 0;

       int temp = num;

       while(num>0){

        rem = num % 10;
        sum = (rem*rem*rem) + sum;
        num = num / 10;
       }
       if(temp == sum){
        System.out.println("Armstrong Number");
       }
       else{
        System.out.println("Not Armstrong Number");
       }
     }

     public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number:");

        int num = sc.nextInt();

        Armstrong a = new Armstrong();
         a. Demo(num);
     }
    }

