//.Accept an array from user and print count of a the even numbers and count of odd nnumbers
import java.util.*;
public class ArrayCount {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Size of an array:");

       int Size = sc.nextInt();
        int arr[] = new int[Size];

        int even_sum=0;
        int odd_sum=0;
        int even_count=0;
        int odd_count=0;

        for(int i = 0 ; i<Size ; i++){
             arr[i] = sc.nextInt();
        }

        for(int i =0; i<Size; i++){
            if(arr[i]%2==0){
                even_sum=even_sum + arr[i];
                even_count++;
            }
            else{
                odd_sum = odd_sum + arr[i];
                odd_count++;
            } 

        }
          System.out.println("Sum of even numbers:" + even_sum);
          System.out.println("Sum of odd numbers is:" + odd_sum);

          System.out.println("Count of even numbers:"+ even_count);
         System.out.println("count of odd numbers is:"+ odd_count);
        

    }
    
}
