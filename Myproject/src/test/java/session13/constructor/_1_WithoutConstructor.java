package session13.constructor;

public class _1_WithoutConstructor {

// Class members 
//variables
	
	//couple of different emp
	
String name ;
int age ;
String dept;     // NOn Static variables 
int empId;

static String companyName = "Unicorn Sys";

public static void main(String[] args) {

	                                         //  create the emps
_1_WithoutConstructor emp1 = new _1_WithoutConstructor();

emp1.name = "ABC";
emp1.age =   27;
emp1.dept = "QA";
emp1.empId = 101;

//2

_1_WithoutConstructor emp2 =  new _1_WithoutConstructor();

emp2.name = "XYZ";
emp2.age =   30;
emp2.dept = "QA";
emp2.empId = 102;

	
	// how to print or Access all the emp

System.out.println("Employee 1 info as belwo ----------------");

System.out.println("Name -> " + emp1.name);
System.out.println("Age -> " + emp1.age);
System.out.println(" dept -> " + emp1.dept);
System.out.println(" empId -> " + emp1.empId );
System.out.println(" Company name - " + _1_WithoutConstructor.companyName);


System.out.println("----------------------------------------------------------");

System.out.println("Employee 2 info as belwo-----------------------------------");

System.out.println(" Name -> " + emp2.name);
System.out.println(" age -> " + emp2.age);
System.out.println(" dept -> " + emp2.dept);
System.out.println(" empId -> " + emp2.empId);
System.out.println(" company name - " + _1_WithoutConstructor.companyName );


	
	
	
	
	
}


	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
