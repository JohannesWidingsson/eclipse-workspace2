package exampel;

//En klass innan det blir objekt
//Vi ska skapa en ritning för objekten
//Ritningen på huset men det är inte huset.



//POJO klass - pain old Java object
public class House {

	
	
	
	
	
	int walls;
	
	String name;
	
	int price;
	
	int id;
	
	private static int idCounter =1;

	//Konstruktor körs vid skapandet av objektet (new) house();
	public House(int walls, String name, int price) {
		
		this.id = idCounter = 0;
		
		idCounter +=1;		
		
		this.walls = walls;
		
		this.name = name;
		
		this.price = price;
		
		
		
		
		
		
	}

	public int getWalls() {
		return walls;
	}

	public void setWalls(int walls) {
		this.walls = walls;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	@Override
	public String toString() {
		return " Huset har " + walls + " antal ,väggar, och har namnet: " + " och kostar: " + price + " och har ett unikt id som är " + id;
	}
	
	
	
	
	
	
	
	
	
	
}
