package trainstation;

public  class  Conductor extends Person {

	
	
	
	public void showAmount() {
		
		personName = scanPeople.next();
		personList.add(personName);
		System.out.println(personList);
		
		people = scanPeople.nextInt();
		
		personAge = scanPeople.nextInt();
		
		
		switch(people) {
		
		
		case 1:
			System.out.println("Vi har 50 personer ombord");
			break;
			
		case 2:
			System.out.println("Biljetter kostar beroende på hur gammal du är");
			break;
			
		case 3:
			System.out.println("Vad vill du köpa för biljett");
			break;
			
			default:
		
		
		
		
		
		}
		
		
	}
	
}
