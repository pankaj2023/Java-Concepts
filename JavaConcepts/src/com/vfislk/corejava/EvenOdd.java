package com.vfislk.corejava;

public class EvenOdd {
	
	public  static void printEvenOdd()
	{
		for(int i=0;i<=30;i++)
		{
			if(i%2==0)
			{
				System.out.print(" "+i);
			}else {
				System.out.print("       "+i);
				System.out.println();
			}
		}
	}

}
