
import java.util.*;
public class program1 {
    
    public static void main(String args[])
    {
        String s,w="",lw="";
        int i;
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter a sentence");
        s=sc.nextLine();

        for(i=0; i<s.length(); i++)
        {
            if(s.charAt(i)!=' ')
            {
                //concatenates the character until we find a space
                w=w+s.charAt(i);
            }
            else
            {
                // check if word length is greater than longest word (lw)
                if(w.length()>lw.length())
                {
                    lw=w;
                }
                  w="";
            }
        }
         System.out.println("Longest word = "+lw);
    }
}
    

