package Zoo;





//L�nade b�ker
import java.util.Arrays;

public class Main {

	public static void main(String[] args) {
	    
		
		//Deklarera en string array
		//Fylla den med djur av datatypen string
		//Skriva ut djuren 
		
		
		
		//Skapa arrayen och fyll p� direkt
		//String[] animal = {"Apa" , "Lejon", "Delfin", "Giraff"};		
		
		
		
		String[] animal = new String[4];
		
		
		//Fyller p� arrayem efterhand
		animal[0] = "Apa";
		animal[1] = "Lejon";
		animal[2] = "Delfin";
		animal[3] = "Giraff";
		
		
		//Skriva ut hela arrayen
		//System.out.println(Arrays.toString(animal));
		
		
		//Skriva �ver ett elementet p� index 3
		animal[3] = "�sna";
		
		//Srkiver ut arrayen med de nya v�rdena
		//System.out.println(Arrays.toString(animal));
		
		//Spara arrayen i en variabel
		//Variabeln vara av samma datatyp som inneh�ller i arrayen
		
		
		String animals =Arrays.toString(animal);
		System.out.println(animals);
         
		
	
		System.out.println(animal[2]);
		
		
			//Skriva ut ett element och lagrar i en variabel
		    //Skriva ut ett element
		String delfin = animal[2];
		
		System.out.println(delfin);
		
	}

}
