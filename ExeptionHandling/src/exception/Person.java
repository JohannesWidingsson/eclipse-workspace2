package exception;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class Person {
	
	
	public static void file() throws FileNotFoundException {
		
		FileInputStream f = new FileInputStream("");
		
		
		//Hantera exception här inne
	}	

		
	{
		try {
		
		
	String[]name = {"Anna " , "Johan"};
	//Unchecked
	//Måste inte hanteras
	
	System.out.println(name[1]);
	
	
	
       }  catch (ArrayIndexOutOfBoundsException e){
    	   
    	   System.out.println("du kan inte välja en person som inte finns var vänlig försök igen: ");
        	 
        	 
       }
		
		
		
		
		
		
		
		
		//Skicka ansvaret vidare
	}
	

}
