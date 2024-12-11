//package Assingment;

import java.util.*;
public class StringReverse 
{

    public static void main(String args[])
    {
      Scanner sc = new Scanner(System.in);
      
      System.out.println("Enter a String:");
      String str = sc.nextLine();

      String Arr[] = str.split("str");
      String rev="";

      for(int i =Arr.length-1;i>=0;i--){
        rev+=Arr[i]+" ";

      }

      System.out.println("Before reverse string:"+str);
      System.out.println("After reverse String:"+rev.trim());
      //read.close();
    }
    
}
