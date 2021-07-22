package com.vfislk.corejava;

public class PrintSequence {
	
	static int result=0;
	
	public static void displaySequence(int number)
	{
		for(int i=1;i<=20;i++)
		{
			result = i *number;
			System.out.println(i+" * "+number+ " = "+result);
		}
		 
	}
	
	
}
