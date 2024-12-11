//accept a number print the * on screen with that number times

import java.util.*;

public class StarPrint {

 public void  Demo(int num){

    for(int i = 1; i <= num; i++){
        System.out.println("*");
    }
 }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number: ");
        int num = sc.nextInt();

        StarPrint obj = new StarPrint();

        obj.Demo(num);
    }
    
}
