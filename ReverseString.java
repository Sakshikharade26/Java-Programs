// Reverse a string

import java.util.*;

public class ReverseString {

    public void Demo( String str)
    {

        String str1=" ";

        for(int i = str.length()-1; i > 0; i--)
        {
               str1 = str1 + str.charAt(i);

        }

        System.out.println("Reversed string is " + str1);

    }

    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
         
        System.out.print("Enter the String : ");
        String  str = sc.nextLine();
        
        ReverseString obj = new ReverseString();
        obj.Demo(str);


    }
    
}
