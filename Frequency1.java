//Accept the number from user ane return the count of odd digits.
import java.util.*;

public class Frequency1 
{
    
    public void Demo(int num)
    {
     int count = 0;
     int rem;

     while(num > 0)
       {
         rem = num % 10;
         if(rem % 2 != 0)
         count++;

         num = num / 10;

        }
        System.out.println("Frequency of odd number is : " + count);
    }

    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number : ");
      
        int num = sc.nextInt();

        Frequency1 fobj = new Frequency1();

        fobj.Demo(num);
    }
}
