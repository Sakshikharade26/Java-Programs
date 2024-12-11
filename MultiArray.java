//print array elements using jagged array

import java.util.*;
public class MultiArray 
{
    
    public static void main(String[] args) 
    {
        int n = 0;
        Scanner sc = new Scanner(System.in);

     
     int Arr[][] = new int[4][];
      
     //we can take input  columns value from user
      for(int i = 0 ; i < 4; i++){ // we can take multiple columns values.thats why we use for loop
        System.out.println("Enter the value of columns: ");
        n = sc.nextInt();
        Arr[i] = new int[n];
      }

       /*  int Arr[][] = new int [5][];
        Arr[0] = new int[2];
        Arr[1] = new int[5];
        Arr[2] = new int[4];
        Arr[3] = new int[3];
        Arr[4] = new int[1];*/

        for(int i = 0; i < Arr.length; i++){
            for(int j = 0; j < Arr[i].length; j++){
                Arr[i][j] = sc.nextInt();
            }
        }

        for(int i = 0; i < Arr.length; i++){
            for(int j = 0; j < Arr[i].length; j++){
                System.out.print(Arr[i][j]+"\t");
            }
            System.out.println();
        }

    }
}
