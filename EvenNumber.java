// Accept the number from user and print that number of even numbers on screen.


import java.util.*;

public class EvenNumber
{

    public void Demo(int num)
    {
        for(int i = 0; i <= num; i++)
        {
            if(i % 2 == 0)
            {
                System.out.println(i);
                

            }

        }

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number : ");
        int num = sc.nextInt();

        EvenNumber obj = new EvenNumber();

        obj.Demo(num);

    }
    
}
