package com.kodnest.pattern.level6;

public class Pattern4 {
	public static void main(String[] args) {
		int i, j;
        // outer loop to handle number of rows
        for (i = 1; i <= 6; i++) {
            for (j = 1; j <= 6 - i; j++) {
                System.out.print(" ");
            }
            for (j = 1; j <= i; j++) {
                System.out.print(i );
            }
            System.out.println();
        }
	}

}
