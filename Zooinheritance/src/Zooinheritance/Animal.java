package Zooinheritance;

public class Animal {
	

	String food;
	
	

	public String getFood() {
		return food;
	}



	public void setFood(String food) {
		this.food = food;
	}



	public void eat (String food) {
		System.out.println("Djuret äter: " + food);
	}

}
