package session10;

public class _2_Car {
	 // non-static variable 
	String name,colour;
	int price ;
	
	//Static variable
	
	static int wheels = 4;
	
	public static void main(String[] args) {
		
	System.out.println("----------------------sports car------------------------------------------");	
		
	_2_Car SpCar = new _2_Car();                           // create obj
	
	SpCar.name = "Audi";
	SpCar.price = 80_000;
	SpCar.colour =  "Sparkling black";
	
	
	System.out.println("----------------------sports car------------------------------------------");	
	
	_2_Car normalCar = new _2_Car();                           // create obj
	
	normalCar.name = "Honda";
	normalCar.price = 8000;
	normalCar.colour = "white";
		
	System.out.println("----------------------sports car exicute-----------------------------------------");	

	System.out.println(	SpCar.name);
	System.out.println(SpCar.price);
	System.out.println(SpCar.colour);
	System.out.println(SpCar.wheels);
	System.out.println("----------------------normal car exicute-----------------------------------------");	

	System.out.println(normalCar.name);
	System.out.println(normalCar.price);
	System.out.println(normalCar.colour);
	System.out.println(normalCar.wheels);
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
		
		
	}
	
	
	
	
	
	
	

}
