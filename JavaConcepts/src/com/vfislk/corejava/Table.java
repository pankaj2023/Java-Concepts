package com.vfislk.corejava;

public class Table {

	static int i=1;
	static int result=0;
	static int evenCount=0;
	static int oddCount=0;
	public static void PrintTable(int number)
	{
		while(i<=30)
		{
			result = number*i;
			System.out.println(number+" * "+i+" = "+result);
			if(result%2==0)
			{
				evenCount++;
			}
			else
			{
				oddCount++;
			}
			i++;
		}
		System.out.println("Even number Count = "+evenCount);
		System.out.println("Odd number Count = "+oddCount);
	}
}
