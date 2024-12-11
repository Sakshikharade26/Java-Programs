/* Calculate the hotel bill with substracting discount amount.
 * 1. If bill is greater than 500 and less than 1500 discount 10%.
 * 2. bill is greater than 1500 then discount 15%.
 */
import java.util.*;

public class HotelBill
{
    
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the hotel bill : ");
        double BillAmount = sc.nextDouble();

        double Discount = 0.0;
        double FinalBill;

        System.out.println("Original Bill Amount is : " + BillAmount);

        if(BillAmount > 500 && BillAmount < 1500)
        {
            Discount = 0.10 * BillAmount; // 10 % discount
            System.out.println("Discount is greater than 500 and less than 1500 : " + Discount);

        }
        else if(BillAmount > 1500) 
        {
          Discount = 0.15 * BillAmount; // 15 % discount
          System.out.println("Discount is greater than 1500 is : " + Discount);

        }
        
        
            FinalBill = BillAmount - Discount;
            System.out.println("Final Bill Amount is : " + FinalBill);
        

    }
}
