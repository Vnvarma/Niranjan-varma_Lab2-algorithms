package travellercurrency.driver;
import travellercurrency.services.*;
import java.util.Scanner;

public class DriverMain {
  public static void main(String[] args) {
		
		Scanner vn=new Scanner(System.in);
		System.out.println("Enter the size of currency denominations ");
		int size=vn.nextInt();
		System.out.println("Enter the currency denominations value ");
		int []currency=new int[size];
		int x;
		for(int i=0;i<size;i++)
		{	x=vn.nextInt();
		while(x<=0)
		{	
			System.out.println("Notes of denomination 0 is not allowed");
			x=vn.nextInt();
		}
		currency[i]=x;
		}
		CurrencyDenominations.sort(currency,0,size-1);
		System.out.println("Enter the amount you want to pay ");
		int amount=vn.nextInt();
		if(amount<=0)
			System.out.println("this is not a valid denomination");
		else
			CurrencyDenominations.paymentApproach(currency,amount);
		vn.close();
	}
  
}
