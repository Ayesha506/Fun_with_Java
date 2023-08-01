package com.kodnest.pattern.level6;

public class Pattern24 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for (int i = 5; i >= 1; i--)
		{
		   char ch ='A' ;
		   for (int j = 0; j <= i; j++)
		   {
		       System.out.print(ch + " ");
		       ch++;
		   }
		   System.out.println();
		}
		for (int i = 0; i<= 5; i++)
		{
		   char ch='A';
		   for (int j = 0; j <= i; j++)
		   {
		       System.out.print(ch + " ");
		       ch++;
		   }
		   System.out.println();
		}

	}

}
