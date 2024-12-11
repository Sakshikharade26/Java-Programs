//Accept a string from user and display the reverse of that string without using inbuilt function.

import java.util.*;
public class ReverseString1
{

    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the string: ");

        String str = sc.nextLine();

        String str1 = "";

        for(int i = str.length()-1;i > 0; i--)
        {
            str1 = str1 + str.charAt(i);


        }

        System.out.println("Reverse String is: " + str1);
        


    }
}
