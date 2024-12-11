//Accept elements in an array print even numbers in an array

import java.util.*;
public class EvenArray 
{

    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the size of an array elements: ");
        int num = sc.nextInt();

        int Arr[] = new int[num];
        System.out.println("Enter the elements in an array: ");

        for(int i = 0; i < num; i++)
        {
            Arr[i] = sc.nextInt();
        }

        for(int i = 0; i < num; i++)
        {
           if(Arr[i] % 2 == 0 )
           {
            System.out.println("Even elements in an array are: " + Arr[i]);
           }
        }

    }
    
}
