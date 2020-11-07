package exampel;

import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {
		// Skapa ett objekt av klassen house
		
		
		
		//Vi har tre objekt av klassen House
		House house = new House ( 4 ,"Öckeröhuset", 200000);
		House tempel = new House(4 , "Tjörnhuset" , 400000);
		House hood = new House(8 , "Skogshuset" , 100000);
		
		
		
		//Skapa en arrayList som håller objekten av klassen House
		//ArrayList är också ett objekt av klassen ArrayList men om nån annan har skapat
		//Låna den
		
		
		ArrayList<House> houseList =  new ArrayList<House>();
		
		
		//Vi har lagt till alla objekten av klassen house in i ArrayListen
		houseList.add(house);
		houseList.add(tempel);
		houseList.add(hood);
		
		//Vi ska lägga till objekten i Listan när vi skapar de
		
		houseList.add(new House (8 , "Skogshuset" , 100000));
		
		
	  
		//Skriva ut Listan
		System.out.println(houseList);
		
		
		
		

	}

}
