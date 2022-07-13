package paymoney.driver;

import paymoney.service.*;
import java.util.*;
public class DriverMain {

	public static void main(String[] args) {
		
		Scanner vn=new Scanner(System.in);
		System.out.println("Enter the size of transaction array ");
		int size=vn.nextInt();
		int transactions[]=new int[size];
		System.out.println("Enter the values of array ");
		for(int i=0;i<size;i++)
		{
			transactions[i]=vn.nextInt();
		}
		System.out.println("Enter the total no of targets that needs to be achieved ");
		int numTargets=vn.nextInt();
		TargetAchieved.isTargetAchieved(transactions,numTargets);
		vn.close();
	}

}
