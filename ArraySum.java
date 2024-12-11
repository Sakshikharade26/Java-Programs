//Accept array elements print sum of all array elements in java

import java.util.*;
 public class ArraySum
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the size of elements in array: ");
        int num = sc.nextInt();

         int Arr[] = new int[num];
         System.out.println("Enter the elements in an array:");
    
        for(int i =0; i < num; i++)
        {
            Arr[i]=sc.nextInt();
        }
         
        int sum = 0;
        for(int i = 0;i < num; i++ )
        {
            sum = sum + Arr[i];
            
        }
            System.out.println(" sum of elements in an array:"+ sum);
         

       
        
    }
}    

