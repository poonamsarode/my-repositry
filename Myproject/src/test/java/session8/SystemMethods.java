package session8;

import java.util.ArrayList;

public class SystemMethods {
	
	
	static String msg = "        hello everyone      ";

	public static void main(String[] args) {
		
	System.out.println(" total char 's in the string msg are -> " +msg.length());
	
	System.out.println(" after removal of white spaces " + msg.trim());
	
	ArrayList<Integer> numberList = new ArrayList<Integer>(); 
	
	numberList.add(11);
	numberList.add(12);              // sequvencely print 
	numberList.add(13);
	numberList.add(14);
	
	for(int i=0 ; i<numberList.size(); i++) 
	{
		System.out.println(numberList.get(i));
		
	}
	
	
	
	
		

	
	
		
		
		
	}
}
