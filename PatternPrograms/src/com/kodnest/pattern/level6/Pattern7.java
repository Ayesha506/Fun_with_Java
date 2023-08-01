package com.kodnest.pattern.level6;

public class Pattern7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// to handle upper triangle
		for (int i = 1; i <= 6; i++) {
            for (int j = 1; j <= 6 - i; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <=2*i-1; j++) {
                System.out.print("*");
            }
            
            System.out.println();
        }
		
		//to handle lower part triangle
		for (int i = 5; i >= 1; i--) {
            for (int j = 1; j <= 6 - i; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <=2*i-1; j++) {
                System.out.print("*");
            }
            
            System.out.println();
        }

	}

}
