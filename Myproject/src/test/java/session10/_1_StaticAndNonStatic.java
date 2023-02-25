package session10;

public class _1_StaticAndNonStatic {
	
	String name;              //both are variable but this non static       or data members
	static int age = 30;       // Static 
	
	public void getName()
	{
		System.out.println(" this is a get name method");
	}
	
	public static void getStart()
	{
		System.out.println(" this is a get start static method");

	}
	
	 public static void main(String[] args) {
		
	          // 1 how to call Static method
		 
		 getStart();                // no need to create object
		 System.out.println(age);
		 
		 // 2 method 
		 
		 _1_StaticAndNonStatic.getStart();                         // mostly use this
		 System.out.println(_1_StaticAndNonStatic.age);
		 
		 // 3 method 
		 _1_StaticAndNonStatic objRef = new _1_StaticAndNonStatic();     
		 objRef.getStart();
		 System.out.println(objRef.age);

		 
		 
		 // Non Static 
		 
		 _1_StaticAndNonStatic objRef1 = new _1_StaticAndNonStatic();     
		 
		 
		 objRef.getName();
		 objRef.name = "tom";
		 System.out.println(objRef.name);
		 
		 
		 
		 
		 
		 
		 
	}
	
	
	
	
	

}
