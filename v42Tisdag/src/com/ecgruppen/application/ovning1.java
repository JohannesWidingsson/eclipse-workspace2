package com.ecgruppen.application;

import java.util.Scanner;

public class ovning1 {
	

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		int tal;
		int summa;
		double total;
		
		
		//Fetch the values
		System.out.println("Please enter tal: ");
		tal = scan.nextInt();
		System.out.println("Please enter summa:");
		summa = scan.nextInt();
		 
		 //add tal to summa
		 total = tal + summa;
		 System.out.println("additionen: " + total);
		 
		 //multiplay by 2
		 total =summa * 2;
		 System.out.println("Multiplication: " + total);
		 
		 //Divide by 2
		 total = summa / 2;
		 System.out.println("Division: " + total);
		 
		 //subtraction
		 total = summa - tal;
		 System.out.println("subtraction: " + total);
		 
		 
			
		 

	}

}
