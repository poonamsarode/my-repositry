package session7;

import java.util.ArrayList;

public class ArrayListGenericType {
	
public static void main(String[] args) {
	
 ArrayList<String> userNames = new ArrayList<String>();                  // Only Store String 
	
 userNames.add(" Stephanie");
 userNames.add(" David");
 userNames.add(" max ");
 
 System.out.println(userNames.size());                                  // 3 
	
 for(int i=0; i<userNames.size(); i++) 
 {
	 System.out.println(userNames.get(i));
 }
	
System.out.println("-------------------------------------------------------------------------");

ArrayList<Integer> numberList = new ArrayList<Integer>(); 
	
numberList.add(11);
numberList.add(22);
numberList.add(33);
numberList.add(44);

System.out.println(numberList.size());

for(int i=0; i<numberList.size(); i++) 
{
	System.out.println(numberList.get(i));
}
	
	
	
	
	
	
}	
	
	
	
	
}	
	
	
	
	

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

