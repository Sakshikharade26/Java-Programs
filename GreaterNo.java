//find greater number
import java.util.*;
public class GreaterNo 
{
  public void Demo(int num1,int num2)
  {
    if(num1 > num2)
    {
        System.out.println("Number one is greater");
    }
    else if(num2 > num1)
    {
        System.out.println("Number two is greater:");
    }
    else
    {
       System.out.println("Both numbers are same");
    }
  }

  public static void main(String args[]){
    Scanner sc = new Scanner(System.in);

    System.out.print("Enter the first number:");
    int num1 = sc.nextInt();

    System.out.print("Enter the second number:");
    int num2 = sc.nextInt();

    GreaterNo obj = new GreaterNo();
    obj.Demo(num1, num2);
    
  }



      
}
