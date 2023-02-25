package session6;

public class StringMethods {

public static void main(String[] args)	{
	                 // string - class & non-primitive data type 
	
	String str1 = " Hello everyone lets something about string" ;
	
	System.out.println("length of str1 is >" + str1.length());
	
	int lenString = str1.length();
	System.out.println("length of str1 >" + lenString);
	 
	System.out.println("...................................................................");
	
	String str2 = " I am learning string in java" ;            // calculate in index 2cd position 
    System.out.println("char at 3rd index position in str2 >"+ str2.charAt(3));
	
	String str3 = "Hello their";
	System.out.println("char at 1st index position in str3 >"+ str3.charAt(1));
    
   char C = str3.charAt(1);
    System.out.println(" char at 1st index position is > " + C);
    
    System.out.println(" length of str3 is > " + str3.length());
    
    System.out.println(" char at 9th position " + str3.charAt(9));
    
    System.out.println(str3.indexOf('e'));
                 
    System.out.println("occurance of 2nd e char" + str3.indexOf('e', 2));   
    
    
    String str4 = "Github is accured by microsoft in year 2018";     // index position of by 
    System.out.println(" the word is by is in str4 at index >" + str4.indexOf("by"));
  //  System.out.println(" the word is \"by\" is in str4 at index >" + str4.indexOf("by"));
    
    
    System.out.println(str4.indexOf("Apple"));
    
    int output = str4.indexOf("XYZ");
    System.out.println(output);
    
   System.out.println("test");   //ln - ur pointer will go to the next line  
   System.out.print("test \n");   //  backslash it is an escape character in java 
   System.out.println("Test \t Test\t Test3");
   
   String str5 = "selenium is use to aoutomate web application";        // all upper case 
   System.out.println(str5.toUpperCase()); 
   
   String str6 = "selenium is USED to aoutomate WEB application";       // Lower case 
   System.out.println(str6.toLowerCase());

   String str7 = "  selenium is USED to aoutomate WEB application"  ;   // removed to space
   System.out.println(str7.trim());

   String str8 = " 16/11/2022"  ;                                      // 16|11|2022
   System.out.println(str8.replace('/', '|'));
   
   String str9 = " selenium can html code";                            // true
   System.out.println(str9.contains("selenium"));
   
   String str10 = "Selenium can html code";
   System.out.println(str10.contains("selenium"));                    // false becoz S is lower case
   
   String str11 = "Selenium can html code";                           // true
   System.out.println(str11.contains("c"));
   
   String str12 = "transaction number is - 45ASD9t thank you";                 // 45ASD9t
   System.out.println(str12.substring(23));
   System.out.println(str12.substring(23, 31));                      //45ASD9t
   
  // hello used this is your id -> 45ASD9t                      // how can call
   String tranxId = str12.substring(23, 31);
   System.out.println("hello used this is your id -> " + tranxId);
   
   String smt1 = "Java is platform independant"; 
   String smt2 = "java is platform independant";
   String smt3 = "Java is platform independant";
   
   System.out.println(smt1.equals(smt2));                    // false becoz J j not equals 
   System.out.println(smt1.equalsIgnoreCase(smt2));          // only cheak the length no capital or small letter  // true 
   
   String str13 = " java is based on object oriented programing priciples";
   System.out.println(str13);                                // same line print 
   
   
   String[] words = str13.split(" ");                        //java
   for(int q = 0; q<words.length; q++)                       //is
   {                                                         //based
	   System.out.println(words[q]);                         //on
   }                                                         //object
   
   String str14 = "Good bye there";                        // bye Good
   String[] arrStr14 = str14.split(" ");
   System.out.println(arrStr14[2] + " " + arrStr14[1] + " " + arrStr14[0]);     // there bye good
  
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
}
	
	
	
	
}
