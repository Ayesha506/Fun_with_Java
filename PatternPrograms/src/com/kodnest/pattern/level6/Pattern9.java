package com.kodnest.pattern.level6;

public class Pattern9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 int i, j; 
		int num = 1;
		  
	        // outer loop to handle upper part
	        for (i = 1; i <= 6; i++) {
	            // inner loop to print stars
	            for (j = 1; j <= i; j++) {
	                System.out.print("*");
	            }
	  
	            // inner loop to print spaces
	            int spaces = 2 * (6 - i);
	            for (j = 1; j <= spaces; j++) {
	                System.out.print(" ");
	            }
	  
	            // inner loop to print stars
	            for (j = 1; j <= i; j++) {
	                System.out.print("*");
	            }
	  
	            System.out.println();
	        }
	  
	        // outer loop to handle lower part
	        for (i = 6; i >= 1; i--) {
	            // inner loop to print stars
	            for (j = 1; j <= i; j++) {
	                System.out.print("*");
	            }
	  
	            // inner loop to print spaces
	            int spaces = 2 * (6 - i);
	            for (j = 1; j <= spaces; j++) {
	                System.out.print(" ");
	            }
	  
	            // inner loop to print stars
	            for (j = 1; j <= i; j++) {
	                System.out.print("*");
	            }
	  
	            System.out.println();
	        }
	    }
}