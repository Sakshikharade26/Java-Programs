
import java.util.*;

 class Addition
{
      public void Demo(int num1 , int num2)
      {

        int sum = 0;

        sum = num1 + num2;
      
        System.out.println( "Addition of two number is : " + sum);
       
      }
      
        
    
}

class Substraction
{
    public void Demo(int num1 , int num2)
    {
       int sum = 0;

       sum = num1 - num2;
       System.out.println("Substraction of two number is : " + sum);
    }
}

class Multiplication
{
    public void Demo(int num1 , int num2)
    {
       int sum = 0;

       sum = num1 * num2;
       System.out.println("Multiplication of two number is : " + sum);
    }
    
}

class Division
{
    public void Demo(int num1 , int num2)
    {
        int sum = 0;

        sum = num1 / num2;
        System.out.println("Division of two number is : " + sum);
    }
}

class Calculator
{

    public static void main(String args[])
    {

     Scanner sc = new Scanner(System.in);
      System.out.print("Enter the value of num1 : ");
     int num1 = sc.nextInt();
      System.out.print("E nter the value of num2 : ");
     int num2 = sc. nextInt();

      Addition aobj = new Addition();
      Substraction sobj = new Substraction();
      Multiplication mobj = new Multiplication();
      Division dobj = new Division();

      aobj.Demo(num1, num2);
      sobj.Demo(num1, num2);
      mobj.Demo(num1, num2);
      dobj.Demo(num1, num2);


      

    }

}



    
    

