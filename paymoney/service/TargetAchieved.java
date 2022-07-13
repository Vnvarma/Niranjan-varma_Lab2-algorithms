package paymoney.service;
import java.util.Scanner;

public class TargetAchieved {
  public static void isTargetAchieved(int []transactions,int numTargets)
	{	Scanner vn=new Scanner(System.in);
	while(numTargets>0)
	{
		System.out.println("Enter the value of target ");
		int target=vn.nextInt();
		int sum=0,j=0,flag=0;
		for(int i:transactions)
		{	j+=1;
		sum+=i;
		if(sum>=target)
		{	
			System.out.println("Target achieved after "+j+" transactions ");
			flag=1;
			break;
		}
		}
		if(flag==0)
			System.out.println(" Given target is not achieved ");
		numTargets--;
	}
	vn.close();
	}
}
