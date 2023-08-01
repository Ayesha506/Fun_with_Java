package com.kodnest.pattern.level6;

public class Pttern16 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num = 1;
		int n=6;
        
        for (int i = 1; i <= n; i++) {
            
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }
            
            for (int j = 1; j <= 2 * i - 1; j++) {
                if (j == 1 || j == 2*i-1)
                    System.out.print("*");
                else
                    System.out.print(" ");
            }
            System.out.println();
        }
  
        // outer loop to handle lower part
        for (int i = n-1; i >= 1; i--) {
            // inner loop to print spaces
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }
            // inner loop to print stars
            for (int j = 1; j <= 2 * i - 1; j++) {
                if (j == 1 || j == 2*i-1)
                    System.out.print("*");
                else
                    System.out.print(" ");
            }
            System.out.println();
        }

	}

}
