package session9;

import java.util.Scanner;

public class _3_UserInput_1 {
	
	
	public int addition(int variableOne, int variableTwo)       
	{
		int total = variableOne + variableTwo;
		System.out.println(" the total is " + total);
		return total;
		
	}

	public static void main(String[] args) {
		
	 System.out.println(" please enter 2 number");
	 
	Scanner sc = new Scanner(System.in);
	int value1 = sc.nextInt();
	int value2 = sc.nextInt();
	
	
	_3_UserInput_1 objref = new _3_UserInput_1();    
	
	objref.addition(value1, value2);
	
	
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	

}
