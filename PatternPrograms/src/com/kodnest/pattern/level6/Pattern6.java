package com.kodnest.pattern.level6;

public class Pattern6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
				for (int i = 1; i <= 6; i++) {
		            for (int j = 1; j <= 6-i ; j++) {
		                System.out.print(" ");
		            }
		            for (int j = i; j >= 1; j--) {
		                System.out.print(j + "");
		            }
		            for (int j = 2; j <= i; j++) {
		                System.out.print(j+"" );
		            }
		            System.out.println();
				}
		

			}

		}

