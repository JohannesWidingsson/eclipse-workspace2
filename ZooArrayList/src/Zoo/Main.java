package Zoo;

import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {
		
		
		//G�ra en arraylist som inneh�ller alla djuren
		ArrayList<String> animals = new ArrayList<>();
		
		
		
		
		
		//L�gga till djur
	
		animals.add("Delfin");
		animals.add("Apa");
		animals.add("Lejon");
		animals.add("Giraff");
		
		//Skriv ut arrayList
		
		System.out.println("Skriver ut hel arrayList" + animals);
		
		
		
		
		//H�mta ett v�rde
		
		System.out.println("H�mtar v�rde " + animals.get(2));
		//Ta bort ett index
		
		animals.remove(0);
		System.out.println("H�mtar v�rde efter remove" + animals.get(2));
		
		//�ndra ett v�rde
		
		animals.set(0, "Get");
		System.out.println("Skriver ut hel arrayList efter vi bytt apa till get " + animals);
		
		
		//Radera allt i listan
		
		animals.clear();
		System.out.println();
		
		

	}

}
