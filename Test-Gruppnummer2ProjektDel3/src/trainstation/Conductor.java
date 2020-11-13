package trainstation;

import java.util.Scanner;

public  class  Conductor extends Person {

	// Flytta allt inne i metoden showaround till main och sen ta bort showaround sen conductor.
	
	public void showAmount() {
		
		
		Scanner scanPeople = new Scanner(System.in);
		
		System.out.println("Tryck 1 för ungdom\n Tryck 2 för vuxen\n Tryck 3 för pensionär\n Tryck 4 för få fram antal passagerare ombord på tåget");
		people = scanPeople.nextInt();
		
	
		
		switch(people) {
		
		
		case 1:
			System.out.println("Ungdomsbiljett kostar 20kr för enkelbiljett och 450kr för månadskort\n Tryck 1 igen för att köpa enkelbiljett\n Tryck 2 igen för att köpa månadskort ");

		y = scanPeople.nextInt();
		  switch (y) {  
		  case 1: System.out.println("Hej. Trong din enkelbiljett kostar 20kr ");
		  break;
		  case 2: System.out.println("Hej. Johan Ditt månadskort kostar 450kr och gäller 30 dagar ");
		  break;
		  }
		  
			
			break;
			
		case 2:
				System.out.println("Vuxenbiljett kostar 35kr och månadskortet kostar 600kr\n Tryck 1 igen f�r att köpa enkelbiljett\n Tryck 2 igen för att köpa månadskort ");
				
				x = scanPeople.nextInt();
		
		 switch (x)  { 
		 case 1:
			 System.out.println("Hej. Johannes din enkelbiljett kostar 35");
			 break;
		 case 2: 
		System.out.println("Hej. Johannes ditt månadskort kostar 600 kr och gäller 30 dagar");
		break;
		 }  
		 
			
			break;
			
		case 3:
			System.out.println("För dig som är pensionär så kostar biljetten 20kr och månadskort för 450kr\n Tryck 1 igen för att köpa enkelbiljett\n Tryck 2 igen för att köpa månadskort ");
		g = scanPeople.nextInt();
			switch (g) {
			case 1: System.out.println("Hej Sten din enkelbiljett kostar 20kr");
			case 2: System.out.println("Hej Ingrid ditt månadskort kostar 450kr och gäller 30 dagar ");
			break;
			}
			
			break;
			
		case 4: 
			System.out.println("Vi har 6 personer ombord på tåget, pgv Covid-19 ");
			System.out.println(" Johannes och Johan\n Pernilla och Trong\n Peter och Sandra");
			
		    
			break;
			
		
		
		
		}
		
		}
		
		
	
}
