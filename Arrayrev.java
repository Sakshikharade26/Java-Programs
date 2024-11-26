// reverse an array 


import java.util.*;

public class Arrayrev {

    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

       System.out.print("Enter the size of an elements : ");
      int size = sc.nextInt();


        int arr[] = new int[size];

        System.out.println("Enter the elements of an array :");

        for(int i = 0; i < size; i++){
            arr[i] = sc.nextInt();
    
        }

        for(int i = arr.length-1; i >= 0; i--){
            System.out.println(arr[i] + " ");
        }

    }
    
}
