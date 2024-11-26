// Check wether the number is divisible by 5 or not

import java.util.*;

 class Divisible {
 
    public void Demo( int num)
    {
        if(num % 5 == 0 ){
          System.out.println("Number is divisible by 5");

        }

        else{
            System.out.println("Number is not divisible by 5");
        }

    }

    

    public static void main(String[] args) 
    {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number : ");

        int num = sc.nextInt();
        
        Divisible obj = new Divisible();

        obj.Demo(num);
    }
}
