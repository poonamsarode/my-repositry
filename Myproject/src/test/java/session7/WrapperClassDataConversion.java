package session7;

public class WrapperClassDataConversion {
	
public static void main(String[] args) {
	
	
	
	String x = "100";
	System.out.println(10 + x);                 //10100 
	                                            //change 110        string to int 
	int i = Integer.parseInt(x);             // parse is a method it accept the String 
	System.out.println(10+i);
	
	int q = 10;
	System.out.println(q + 5);
	
	String S = String.valueOf(q);
	System.out.println(q + S);                   //1010
	
	String b = "12.33";
	System.out.println(b + 10.00);              //12.33100
	
	double d = Double.parseDouble(b);
	System.out.println(d + 10.00);              // 22.33
	   
   // String g =  "456";                         // removed $ any symbol becoz it should be plan value accepted & $ is character 
//	int h = Integer.parseInt(g);
//	System.out.println(h + 20);                // 476
	
	                                           // number format exception how to delete this value 
	//String g = "$456";
 //   String temp = g.replace("$", " ");
 //   int h = Integer.parseInt(temp);
//    System.out.println(h + 20);
	
//	String g = "$456";
//	String temp = g.replaceAll("[^0-9]","");
//	int h = Integer.parseInt(temp);
//	System.out.println(h+20);
	
	String g = "$456";
	String temp = g.substring(1);
	int h = Integer.parseInt(temp);
	System.out.println(h+20);
	
	
}
	
	
	
	
	
	
	
	
	
	

}
