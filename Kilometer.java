/*Accept kilometers from user and calculate rate according
 1. upto 100 km rate is 25 rs per km.
 2.after 100 km rate is 15 per km. */


import java.util.*;

public class Kilometer 
{

    public static void main(String args[])
    {
     Scanner sc = new Scanner(System.in);
     System.out.print("Enter the kilometer : ");

     Double Km = sc.nextDouble();

     Double rate;

     if(Km <= 100)
        {
           rate = Km * 25;
           System.out.println("Rate of  uoto 100 kilometer : " + rate);
        }
        else
        {
           rate = (Km * 25) +  ((Km - 100) * 15);
           System.out.println("Rate of after 100 kilometer : " + rate);
        }
         
    

     
     
    }
    
}
