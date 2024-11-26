// find length of an array

import java.util.*;

public class Arraylength 
{

    
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter the size of an array : ");
        int size = sc.nextInt();

        int arr[] = new int[size];

        System.out.println("print the elements in an array : ");

        for(int i = 0; i < size; i++)
        {
            arr[i] = sc.nextInt();


        }

        int length = arr.length;

        System.out.println("length of an array is : " + length);

       
        

    }
    
}
