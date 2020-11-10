package trainstation;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		//Vi behöver en scanner för att mata in värden 
		Scanner scan  = new Scanner(System.in);
		String name = scan.next();
		int price = scan.nextInt()
;		int age = scan.nextInt();
		String ticket = scan.next();
		String Card = scan.next();
		
		
		Person person =  new Person(name, age);
		Ticket tickets = new Ticket(price, ticket, Card);
		Ticket tickets1 = new Ticket(35, ticket, Card);
		
		if(age <= 18) {
			System.out.println(tickets.price);
			
		}
		else if( age > 65){
			
		}
		
		else {
			
		}
		

	}

}
