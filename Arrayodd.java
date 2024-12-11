//Accept an array elements and  print sum odd numbers in an array

import java.util.*;
 public class Arrayodd
{

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the size of an array: ");
        int num = sc.nextInt();

        int Arr[] = new int[num];
        System.out.println("Enter the elements in an array: ");

        for(int i = 0; i < num;i++ )
        {
          Arr[i] = sc.nextInt();
        }

        int sum = 0;
        for(int i= 0; i < num;i++)
        {
            if(Arr[i] % 2 != 0)
            {
                sum = sum + Arr[i];
            }
            
        }
        System.out.println("Sum of odd elements in an array: " + sum);

        
    }

}