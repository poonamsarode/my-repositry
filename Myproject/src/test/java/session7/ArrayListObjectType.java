package session7;

import java.util.ArrayList;

public class ArrayListObjectType {
	
public static void main(String[] args) {
	
ArrayList<Object> empInfo = new ArrayList<Object>();  //This is ultimate thing which can store every type of data you can grow & shrink 

      empInfo.add("Tom");
      empInfo.add("M");
      empInfo.add(500);
      empInfo.add(true);
      
      System.out.println(empInfo.size());
      
      for(int i=0; i<empInfo.size(); i++)
      {
      System.out.println(empInfo.get(i));
      }
      
   boolean result = empInfo.contains("Tom");                       //Check word  available
   System.out.println("result is" + result);
      
 //  empInfo.clear();                                               //Don't need to store any data type 
 //  System.out.println(empInfo.size());                            // 0
 //  System.out.println(empInfo.isEmpty());                       // either this Array is empty ?  true
   
   empInfo.add(2, 600);                                         // on 2nd index number hike a value to 600 
   
   for(int i=0; i<empInfo.size(); i++) 
   {
     System.out.println(empInfo.get(i));     
   }
   

	
	
	
}
	
	
	
	
	
	

}
