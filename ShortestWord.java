// Shortest word in the string in java


import java.util.*;
 class Word 
{
    
    public void Demo(String str)
    {
        String[] words = str.split(" ");

        String shortest = words[0];

        for(int i = 1; i < words.length;i++){
            if(words[i].length() < shortest.length())
            {
                shortest = words[i];

            }
        }
    }
 }
 
      class ShortestWord
{

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the string:");
        String str = sc.nextLine();

        Word obj = new Word();
        obj.Demo(str);
    }


}

