// array using trim function

import java.util.*;

public class Arraytrim 
{

    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);

        /*System.out.print("Enter the size of an array : ");
        int size = sc.nextInt();

        String arr[] = new String[size];

        System.out.println("Enter the values of an array : ");

        for(int i = 0; i < size; i++)
        {
            arr[i] = sc.nextLine();

        } */

        String array[] = { "  Sakshi  ", "  Sanika  ",  "  Kunal  "};

        for(int i = 0; i < array.length; i++)
        {
            System.out.println(array[i].trim());

        }

        


    }
    
}
