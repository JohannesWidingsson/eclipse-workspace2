package Kollektivtrafik;

import java.util.Scanner;

public class Bussbiljett {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		
		
		Biljett biljett = new Biljett ();
		
	
		
		System.out.println("Hur gammal �r du? ");
		
		
	
		
	
		
	
		

		
		 int x;
		 int y = 18;
		 int z = 65;
		 int n = 19;
		 
     	 x = scan.nextInt();
		 
		 if(x<= y) { 
		
			 System.out.println("Om du �r 18 �r eller yngre s� kostar  Enkelbiljetten " + biljett.enkelbiljettunder +  " Kr ");
			 System.out.println(" Vi har �ven M�nadsbiljett som kostar " + biljett.m�nadsbiljettunder + " kr ");
		}	
			 	

	 else if(z <= x ) {
		 
		 System.out.println("F�r dig som �r 65 �r eller �ldre kostar bijetten. " + biljett.enkelbiljettunder + " Kr ");
		 System.out.println("Och m�ndaskortet kostar. " + biljett.m�nadsbiljettunder + " Kr ");
		 
		 
	 }
	
	 
	 else  {
		 
		 
		 System.out.println("Du som �r 19 �r eller �ldre kostar biljetten " + biljett.enkelbiljett�ver);
		 System.out.println("Och m�nadskortet kostar " + biljett.m�ndasbiljett�ver);
		 
	 }	
	
	
	
	}
	
	
}
	
	
	
	
	
	
		

		
		
		
		
		
	
	
	
		
		
		
		

	



