// Accept the number from user and Display the even factor of that number


import java.util.*;

public class EvenFactor {
    public void Demo(int num)
    {

        for(int i = 1; i <= num; i++ )
        {
            if(num % i == 0 && i % 2 == 0){
                System.out.println(i);
            }

        }

    }
   
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number : ");
        int num = sc.nextInt();

        EvenFactor obj = new EvenFactor();

        obj.Demo(num);


    }
}
