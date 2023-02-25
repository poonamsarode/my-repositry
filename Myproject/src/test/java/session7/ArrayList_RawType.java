package session7;

import java.util.ArrayList;

public class ArrayList_RawType {
 
 public static void main(String[] args) {
 ArrayList ar = new ArrayList();
 
 System.out.println(ar.size());
 
 ar.add(100);                              //0
 ar.add(200);                              //1
 ar.add("test");                           //2
 
 System.out.println(ar.size());
	 
 ar.add(300);                             //3
 ar.add(400);                             //4
 
 System.out.println(ar.size());           // Automatically capacity change
 System.out.println("...............................................................................................");
 
 
 for(int i = 0; i<ar.size(); i++)         //find all the index number
 {
	 System.out.println(ar.get(i));
	 
 }
 
// System.out.println(ar.get(2));       // Creak individual values 
 
// System.out.println("--------------------------------------------------------------------------------------");
 
                                      // whether test is available 
// for(int i = 0; i<ar.size(); i++) 
// {
//   if(ar.get(i).equals("test")) 
//   {                                                 //available
//	  System.out.println("at index position " + i + " present " + ar.get(i));
	  
//   }
   
   
// }
 
 ar.remove(2);
 for(int i= 0; i<ar.size(); i++)                   //removed 2 index
 {
	System.out.println(ar.get(i));
	
 }
	 
	 
	 
	 
	 
	 
 }
}
