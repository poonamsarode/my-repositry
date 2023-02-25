package session13.constructor;

public class _2_WithConstructorNew {
	
	
		String name ;
		int age ;
		String dept;     // NOn Static variables 
		int empId;
		
	static String companyName = "Unicorn Sys";

// This is constructor for new joiner on boarding 	
	
public _2_WithConstructorNew(String EmpName , int employeeId) 
{
	name = EmpName;              // Variable name should get Initialized  
	empId = employeeId;
	
}
	
    //fully on boarding joiner

public _2_WithConstructorNew(String empName , int ageOfemployee , int employeeId) 
{
	name = empName;
	age = ageOfemployee;
	empId = employeeId;
}
	
	
	
	
	
	public static void main(String[] args) {
		
	}
		

}
