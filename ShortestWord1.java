//Find Smallest Word in the String

import java.util.*;
 class SmallestWord 
 {

    public String Demo(String str)
    {

        String[] str1 =  str.split(" ");
        String sw = str1[0];

        for(int i = 1; i<str1.length;i++)
        {
            if(str1[i].length() < sw.length())
            {

                sw = str1[i];
            }
           
        }
        return sw;
    }
}

class ShortestWord1
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the string:");

        String input = sc.nextLine();

        SmallestWord obj = new SmallestWord();

        String SmallestWord = obj.Demo(input);
        
        System.out.println("Smallest word of string is: " + SmallestWord);

    }
}

