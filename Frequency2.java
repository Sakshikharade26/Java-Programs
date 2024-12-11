//Accept a number from user and return the count of even digits

import java.util.*;
public class Frequency2 {
    public void Demo(int num){

        int count = 0;
        int rem;

        while(num > 0)
        {

            rem = num % 10;
            if(rem % 2 == 0)
            

             count++;
             num = num / 10;
            
            
        }
          System.out.println("count of Even numbers are : " + count);
        


        
    }


    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the nuber:");
        int num = sc.nextInt();

        Frequency2 obj = new Frequency2();
        obj.Demo(num);
    }
    
}

