package com.vfislk.corejava;

public class SumOfOdd {
	
	static int i=1;
	static int sum =0;
	public static int sum(int number)
	{
		while(i<=number)
		{
			if(i%2!=0)
			{
				sum = sum +i;
			}
			i++;
		}
		return sum;
	}

}
