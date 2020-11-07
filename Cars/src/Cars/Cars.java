package Cars;

import java.util.ArrayList;
import java.util.Scanner;

public class Cars {
	

	public static void main(String[] args) {
		
		
		//Skapa en scanner 
		//Som tar emot en str�ng
		//str�ngen lagras i en variabel 
		//och den skickas in 
		
		//Scanner scanner = new Scanner(System.in);
		
		//String name = scanner.next();
		//int age = scanner.nextInt();
			
		
		//buyTicket(){}
		
		
		//Ticket �r det enda objektet
	//	Variabler inne i ticket
		//name
		//age
		//price
		
		//Ticket ticket = new Ticket(name, age, price);
		
		//addTicket metod:
		//tar emot inmatining från scanner
		//skapar objketet
		//lagras objketet i en en arraylista
		
		//showTicket
		//skriva ut allt fr�n arraylistan
		
		
		//main
		//case 1 anropar addTicket
		//case 2 anropas showTicket
		
		
		
		
		//En person skapas
		//Person person = new Person(name, age);
		
		
		
		
		
		
		
		Person person1 = new Person("Bj�rn", 34);
		
		
		
		
		
		ArrayList<String> Cars = new ArrayList<>();
		
		Lager Bmw = new Lager();
		Lager Volvo = new Lager();
		Lager Mercedes = new Lager();
		Lager Audi = new Lager();
		Lager Saab = new Lager();
		Lager Volkswagen = new Lager();
		Lager Ferrari = new Lager();
		Lager Mazda = new Lager();
		Lager Toyota = new Lager();
		Lager Nissan = new Lager();
		
		
		//Cars
		
		
		Cars.add("Bmw");
		Cars.add("Volvo");
		Cars.add("Mercedes");
		Cars.add("Audi");
		Cars.add("Saab");
		Cars.add("Volkswagen");
		Cars.add("Ferrari");
		Cars.add("Mazda");
		Cars.add("Toyota");
		Cars.add("Nissan");
		
		
		System.out.println("Vi har dessa bilarna i v�rt lager " + Cars);
		
          Bmw.showCar();
  
          

	}

}