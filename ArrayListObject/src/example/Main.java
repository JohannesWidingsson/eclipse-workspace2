package example;

import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {
		
		ArrayList<person> personlist = new ArrayList <person>();
		
		
		person sandra = new person (37, "Hemma", "Sandra");
		
		person johan = new person (24, "Borta", "Johan");
		
		personlist.add(sandra);
		personlist.add(johan);
		
		//personlist.add(new person(Person (37, "Hemma" "Sandra"))
		
		
		  System.out.println(personlist);
	}

}
