// find dulicatees elements  from array

import java.util.*;

public class Arrayduplicate 
{

    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the size of an array : ");
        int size = sc.nextInt();

        int arr[] = new int[size];

        System.out.println("Enter the elements in an array : ");

        for(int i = 0; i < size; i++)
        {
            arr[i] = sc.nextInt();

        }

        System.out.println("Duplicates elements in an array :");

        for(int i = 0; i < arr.length; i++)
        {
            for(int j = i + 1; j < arr.length; j++)
            {
               if(arr[i] == arr[j])
               {
                   System.out.println(arr[i]);
                   break;
               }
            }

        }



    }
    
}
