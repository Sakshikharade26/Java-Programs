//count even number in the series
import java.util.*;
public class CountEven {
    public void Demo(int num){
        int count=0;

        for(int i =0 ; i <= num ; i++)
        {
            if(i % 2 != 0)
            {
                count++;
            }
        }
        System.out.println("Count of even number is:" + count);
    }

    public static void main(String args[])
    {
      Scanner sc = new Scanner(System.in);
      System.out.print("Enter the number:");

      int num = sc.nextInt();

      CountEven eobj = new CountEven();
      eobj.Demo(num);
    }
    
}
