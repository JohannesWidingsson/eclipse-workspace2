package trainstation;

import java.util.Scanner;

public class Ticket {
	
	int price;
	String monthlyCard;
	String regularTicket;
	Scanner scanMoney = new Scanner(System.in);
	


	public Ticket(int price, String regularTicket, String monthlyCard) {
		super();
		this.price = price;
		this.monthlyCard = monthlyCard;
		this.regularTicket = regularTicket;
	}

	//If-sats till när man ska köpa biljett för en viss ålder.
		//under 18 år, över 18 år och 65 år gammal.
	public void buyTicket() {
		
	
			
			
	}
		
	public void showTicket() {
			
	}

}
