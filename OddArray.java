// Accept an elements in an array print odd numbers in an array

import java.util.*;
public class OddArray {

    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the size of an array: ");
        int num = sc.nextInt();

        int Arr[] = new int[num];
        System.out.println("Enter the elements in an array: ");

        for(int i = 0; i < num;i++){
           Arr[i] = sc.nextInt();
        }

        for(int i = 0 ;i < num ; i++){
           if(Arr[i] % 2 != 0){
            System.out.println("odd numbers in an array are : " + Arr[i]);
           }
        }


    }
    
}
