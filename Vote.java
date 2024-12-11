//Check person is eligible for vote
import java.util.*;
public class Vote 
{
    public void Demo(int age)
    {
       if(age >= 18){
        System.out.println("Eligible for vote");
       }
       else{
        System.out.println("Not eligible for vote");
       }
    }

    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the age:");

        int age = sc.nextInt();

        Vote obj = new Vote();
        obj.Demo(age);
    }
}
