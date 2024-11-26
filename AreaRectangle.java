//find area of rectangle

import java.util.*;

public class AreaRectangle {

   public void  rectangle(int length, int width){

    int Area;
    Area = length * width;

    System.out.println("Area of rectangle : " + Area);

    }

    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the value of length : ");
        int length =  sc.nextInt();

        System.out.print("Enter the value of width :  ");
        int width = sc.nextInt();

        AreaRectangle obj = new AreaRectangle();
         obj.rectangle(length, width);
        
    }

    
}
