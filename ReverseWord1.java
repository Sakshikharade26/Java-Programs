import java.util.*;
class Reverse1 
{
   public void revrseDemo(String str) 
   {

        String str1 = "";
         
         str.split(" ");
       for (int i = str.length() - 1; i >= 0; i--) 
       {
           
            str1 = str1 + str.charAt(i);
            
        }
        System.out.println(str1);
    }
}

 class ReverseWord1 
{
    public static void main(String arg[]) 
    {
        Scanner sc = new Scanner(System.in);

        System.err.print("Enter the string: ");
        String str = sc.nextLine();
         
        Reverse1 obj = new Reverse1();
       
        obj.revrseDemo(str);

    }

}
