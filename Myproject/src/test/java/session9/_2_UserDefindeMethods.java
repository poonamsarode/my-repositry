package session9;

public class _2_UserDefindeMethods {
	
                   // No input no return
	public void test()
	{
		System.out.println("hello user this is test method");
	}
	
	    
	// 2.no input but some return 
	
	public String nameOfCountry()
	{
		String countryName = "India";
		return countryName;
	}
	
	public String[] listOfStudents() 
	{
//		System.out.println(" the list of students is : ");
		
		String names[] = new String[3];
		names[0] = "A";
		names[1] = "B";
		names[2] = "C";
     return names;
		
	}
	       // some input some return 
	public int addition(int variableOne, int variableTwo)
	{
		int total = variableOne + variableTwo;
		return total;
	}
	
	public int billOfTwoPerson(int personOne, int personTwo)
	{
		int total = personOne + personTwo ;
		return total;
		
	}
	
	public String factoryName(String nameOfFactory)
	{
		if(nameOfFactory.equals("nike")) 
		{
		 System.out.println(" This is a nike factory");
		 String fact1 = "NIKE";
		 return fact1;
		}
		else if(nameOfFactory.equals("puma")) 
		{
			System.out.println(" this is a puma factory");
			String fact2 = "puma";
			return fact2;
		}
		
		return "No factory of this name is available";
	}
	
	
	
	
	public static void main(String[] args) {
		
	_2_UserDefindeMethods userDefindeMethods = new _2_UserDefindeMethods();
	
	// userDefindeMethods.test();
		
	//	String outputOfMethods = userDefindeMethods.nameOfCountry();
	//	System.out.println(outputOfMethods);
		
	//	System.out.println(userDefindeMethods.nameOfCountry());
	//	System.out.println(userDefindeMethods.nameOfCountry().toUpperCase());
		
	//	System.out.println(" hey their my country name is :" + userDefindeMethods.nameOfCountry() + " i am proud of it");
		
	//	String listOfStudents[] = userDefindeMethods.listOfStudents();
		//for(int i = 0; i<listOfStudents.length; i++) 
		//{
			//System.out.println(listOfStudents[i]);
			
	//	}
		
      //   System.out.println(userDefindeMethods.listOfStudents()[2]);
	
//	int additionTotal = userDefindeMethods.addition(10, 20);
		
//	System.out.println(additionTotal);
//	System.out.println(userDefindeMethods.addition(45, 45));
	
	
//	int totalBill = userDefindeMethods.billOfTwoPerson(30, 90);
//	int billAfterTax = 10 + totalBill;
//	System.out.println(" total bill after tax imposition : " + billAfterTax);
	
//	System.out.println( " bill of two person after tax added "+ userDefindeMethods.billOfTwoPerson(15, 15) + 10);    //3010
	
//	System.out.println( " bill of two person after tax added "+ (userDefindeMethods.billOfTwoPerson(15, 15) + 10));    //40

		
	String factName = userDefindeMethods.factoryName("nike");
	System.out.println(factName);
	
		
		
		
		
	}
	
	
	
	
	
	

}
