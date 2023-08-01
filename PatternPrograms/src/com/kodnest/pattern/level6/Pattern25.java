package com.kodnest.pattern.level6;

import java.util.Scanner;

public class Pattern25 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		int n= scan.nextInt();
		for (int i = 0; i<=n; i++) {
		    // Inner for loop for logic execution
		    for (int j = 0; j<= n / 2; j++) {
		    // prints two column lines
		    if ((j == 0 || j == n / 2) && i != 0 ||
		    // print first line of alphabet
		    i == 0  && j != n / 2 ||
		    // prints middle line
		    i == n / 2)
		    System.out.print("*");
		    else
		    System.out.print(" ");
		    }
		    System.out.println();
		    }

	}

}
