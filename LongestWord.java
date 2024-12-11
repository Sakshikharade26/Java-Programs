// find longestWord in the string

import java.util.*;

   class Word {
    public String Demo(String str){

      String[] str1 = str.split("");
       String lw =" ";

       for(int i = 0; i < str1.length; i++)
       {
        if(str1[i].length() > lw.length())
        {
            lw = str1[i];
        }
       }

       return lw;
  
    }

}

class LongestWord{

    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the String: ");

        String input = sc.nextLine();

        Word obj = new Word();
        String Word = obj.Demo(input);

        System.out.println("Largest Word of String is:" + Word);
        }

}
