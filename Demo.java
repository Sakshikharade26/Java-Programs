
import java.util.*;
 public class Demo {
    
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the String:");
        String str = sc.nextLine();
        
        String[] str1 = str.split("");
        String lw ="";

        for(int i =0; i< str1.length; i++){
            if(str1[i].length() > lw.length()){
                lw = str1[i];
            }

        }
        System.out.println("The longest Word is:" + lw);
    }
    
}
