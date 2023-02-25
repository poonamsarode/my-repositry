package session8;

public class DefaultValue {
	
public static String Str;
public static int i ;
public static double d;
public static boolean b;
public static char c;
public static byte z;

public static void main(String[] args)
{	
 	System.out.println(Str);                  //null
 	System.out.println(i);                    //00
 	System.out.println(d);                    //0.0
 	System.out.println(b);                   //false
 	System.out.println(c);                   //empty space
 	System.out.println(z);                   //0
 	
 //	int p; 
// 	System.out.println(p);                 //  this is not initialize
 	
 //	int p = 123;
// 	System.out.println(p);
 	
 //	int division = 9/3;
// 	System.out.println(division);
 	
 	int division = 0/3 ;
 	System.out.println(division);       // get arithamatic exception
 	
 	
 	

}	
	
	
	
	
	
	
	
	
	
	
	
	

	

}
