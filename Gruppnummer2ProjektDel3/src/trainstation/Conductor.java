package trainstation;

import java.util.Scanner;

public  class  Conductor extends Person {

	// Flytta allt inne i metoden showaround till main och sen ta bort showaround sen conductor.
	
	public void showAmount() {
		
		
		Scanner scanPeople = new Scanner(System.in);
		
		System.out.println("Tryck 1 f�r ungdom\n Tryck 2 f�r vuxen\n Tryck 3 f�r pension�r\n Tryck 4 F�r f� fram antal passagerare ombord p� t�get");
		people = scanPeople.nextInt();
		
	
		
		switch(people) {
		
		
		case 1:
			System.out.println("Ungdomsbiljett kostar 20kr f�r enkelbiljett och 450kr f�r m�nadskort\n Tryck 1 igen f�r att k�pa enkelbiljett\n Tryck 2 igen f�r att k�pa m�nadskort ");

		y = scanPeople.nextInt();
		  switch (y) {  
		  case 1: System.out.println("Hej. Trong din enkelbiljett kostar 20kr ");
		  break;
		  case 2: System.out.println("Hej. Johan Ditt m�nadskort kostar 450kr och g�ller 30 dagar ");
		  break;
		  }
		  
			
			break;
			
		case 2:
				System.out.println("Vuxenbiljett kostar 35kr och m�nadskortet kostar 600kr\n Tryck 1 igen f�r att k�pa enkelbiljett\n Tryck 2 igen f�r att k�pa m�nadskort ");
				
				x = scanPeople.nextInt();
		
		 switch (x)  { 
		 case 1:
			 System.out.println("Hej. Johannes din enkelbiljett kostar 35");
			 break;
		 case 2: 
		System.out.println("Hej. Johannes ditt m�nadskort kostar 600 kr och g�ller 30 dagar");
		break;
		 }  
		 
			
			break;
			
		case 3:
			System.out.println("F�r dig som �r pension�r s� kostar biljetten 20kr och m�nadskort f�r 450kr\n Tryck 1 igen f�r att k�pa enkelbiljett\n Tryck 2 igen f�r att k�pa m�nadskort ");
		g = scanPeople.nextInt();
			switch (g) {
			case 1: System.out.println("Hej Sten din enkelbiljett kostar 20kr");
			case 2: System.out.println("Hej Ingrid ditt m�nadskort kostar 450kr och g�ller 30 dagar ");
			break;
			}
			
			break;
			
		case 4: 
			System.out.println("Vi har 6 personer ombord p� t�get, pgv Covid-19 ");
			System.out.println(" Johannes och Johan\n Pernilla och Trong\n Peter och Sandra");
			
		    
			break;
			
		
		
		
		}
		
		}
		
		
	
}
