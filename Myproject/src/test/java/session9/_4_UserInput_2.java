package session9;

import java.util.Scanner;

public class _4_UserInput_2 {
	
	public void factoryName(String nameOfFactory)
	{
		if(nameOfFactory.equals("nike")) 
		{
		 System.out.println(" This is a nike factory");
		
		}
		else if(nameOfFactory.equals("puma")) 
		{
			System.out.println(" this is a puma factory");
		}
		
			else 
    	{
				System.out.println(" no factory of this name is availabe");
		}
	}
		
		public static void main(String[] args) {
			
			System.out.println(" please enter the factory name");
			
			Scanner sc = new Scanner(System.in);
			String userInputFactName = sc.next();
			
			_4_UserInput_2 objref = new _4_UserInput_2();
			
			objref.factoryName(userInputFactName);
			
		
		}
		
		
		
		
	  }
	
	
	


