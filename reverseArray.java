//print array elements in reversed order take input from user

import java.util.*;

public class reverseArray {


    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of an array : ");
        int size = sc.nextInt();

        int arr[] = new int[size];

        System.out.println("Enter the elements in an array : ");

        for(int i = 0; i < size; i++){
            arr[i]= sc.nextInt();
        }
        
        System.out .println(" print elements in reverse order : ");

        for(int i = size-1; i >=0; i--){
            System.out.println(arr[i] + " ");
        }
    }
    
    

        
    
    
}
