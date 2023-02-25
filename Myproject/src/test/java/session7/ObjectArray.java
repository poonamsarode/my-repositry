package session7;

public class ObjectArray {
	
	public static void main(String[] args) {
		
	Object[] emp = new Object[5];
	
	emp[0] = "Tom";               //Name
	emp[1] =  25;                 //age
	emp[2] =  1000;               //salary
	emp[3] =  "m";                //male
	emp[4] =  true;               //laptop
	
	System.out.println("the monthlay salary of employee" + emp[0] + " is " + emp[2]);   //it will be accept
	
	System.out.println(" All info related to employee" + emp[0]);	
	for(int i = 0; i<emp.length; i++)
	{
	  System.out.println(emp[i]);
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	}	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
