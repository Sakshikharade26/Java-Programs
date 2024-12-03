/* print pattern

    1 2 3 4 5
    2 3 4 5 1 
    3 4 5 2 1
    4 5 3 2 1
    5 4 3 2 1
 */

import java.util.*;

public class Pattern2 
{
    public void Demo(int num)
    {

        for(int i = 0; i < num; i++){
            for(int j = 0; j < num; j++){
                int value = (i + j) % num + 1;
                System.out.print(value + " ");
            }
              System.out.println();
        }

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number : ");

        int num = sc.nextInt();

        Pattern2 pobj = new Pattern2();
        pobj.Demo(num);
    }
    
}
