// Accept number from user and print its factor in decreasing order.

import java.util.*;

public class DecreasingFactor {
    public void Demo(int num )
    {

        for(int i = num; i >= 1; i--)
        {
          if(num % i == 0)
          {
            System.out.println(i);

          }

        }

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number : ");
        int num = sc.nextInt();

        DecreasingFactor obj = new DecreasingFactor();

        obj.Demo(num);

    }
    
}
