package com.kodnest.pattern.level6;

public class Pattern15 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=6;
		for (int i = n; i >= 1; i--) {
			  
            // inner loop to print spaces.
            for (int j = i; j < n; j++) {
                System.out.print(" ");
            }
  
            for (int k = 1; k <= (2 * i - 1); k++) {
                // printing stars.
                if (k == 1 || i == n || k == (2 * i - 1)) {
                    System.out.print("*");
                }
                // printing spaces.
                else {
                    System.out.print(" ");
                }
            }
  
            System.out.println("");
        }

	}

}
