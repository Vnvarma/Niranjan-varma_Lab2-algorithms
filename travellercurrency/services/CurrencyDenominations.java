package travellercurrency.services;

import java.util.HashMap;

public class CurrencyDenominations {
  public static HashMap<Integer,Integer> ns=new HashMap<>();
	static void merge(int arr[], int l, int m, int r)
	{
		
		int n1 = m - l + 1;
		int n2 = r - m;

		
		int L[] = new int[n1];
		int R[] = new int[n2];

		
		for (int i = 0; i < n1; ++i)
			L[i] = arr[l + i];
		for (int j = 0; j < n2; ++j)
			R[j] = arr[m + 1 + j];

		

		
		int i = 0, j = 0;

		
		int k = l;
		while (i < n1 && j < n2) {
			if (L[i] >= R[j]) {
				arr[k] = L[i];
				i++;
			}
			else {
				arr[k] = R[j];
				j++;
			}
			k++;
		}

		
		while (i < n1) {
			arr[k] = L[i];
			i++;
			k++;
		}

		
		while (j < n2) {
			arr[k] = R[j];
			j++;
			k++;
		}
	}

	
	
	public static void sort(int arr[], int l, int r)
	{
		if (l < r) {
			
			int m =l+ (r-l)/2;

			
			sort(arr, l, m);
			sort(arr, m + 1, r);

			
			merge(arr, l, m, r);
		}
	}

	public static void paymentApproach(int []currency,int amount)
	{
		int note=-1;
		if(amount==0)
		{	
			System.out.println("Your payment approach in order to give min no of notes will be ");
			for(int i:currency)
			{
				if(ns.containsKey(i))
					System.out.println(i+":"+ns.get(i));
			}
			return;
		}
		for(int i=0;i<currency.length;i++)
		{	
			if(currency[i]<=amount)
			{
				note=currency[i];
				break;

			}
		}
		if(note==-1)
		{
			System.out.println("exact amount cannot be given with the highest denomination");
			return;
		}
		int notes=amount/note;
		amount-=notes*note;
		ns.put(note, notes);
		paymentApproach(currency,amount);
	}

}
