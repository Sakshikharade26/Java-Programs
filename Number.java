// Accept one number and print all numbers till that number

import java.util.*; 

    public class Number 
{
    public void Demo(int num)
    {
        for(int i = 0; i <= num ; i++)
        {
            System.out.println(i);
        }

    }

    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number : ");
        int num = sc.nextInt();

        Number obj = new Number();
        obj.Demo(num);


        
    }

    
}
