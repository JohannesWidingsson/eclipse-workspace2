package example;

public class person {
	
	// Skapa en person med attribut ålder , adress , namn
	//Skapa en konstruktor
	//Skapa 4 personer av objektet person
	
	int age;
	String adress;
	String name;
	public person(int age, String adress, String name) {
	
		this.age = age;
		this.adress = adress;
		this.name = name;
		
		
		
		
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getAdress() {
		return adress;
	}
	public void setAdress(String adress) {
		this.adress = adress;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}


	
}
