package session2;

public class IncrementAndDecrement {
	
public static void main(String[] args) {

	//++ and -- 
    int a = 1;
	a = a+1;
	System.out.println(a);
	
	int b = 5;
	int newval = 5 + 1;
	System.out.println(newval);
	
	int i = 1;
    int j = ++i ;
    System.out.println(i);
    System.out.println(j);
    System.out.println(".........................post increment .....................................");
    int p = 1;
    int q = p++;
    System.out.println(p);
    System.out.println(q);
    
    System.out.println("................pre decrement.......................");
    int m = 2;
    int n = --m;
    System.out.println(m);
    System.out.println(n);
    
    System.out.println("................post decrement.....................");
    int c = 0;
    int d = c--;
    System.out.println(c);
    System.out.println(d);
    
 char ab = 'A';
 char output = ab--;
 System.out.println(output);    //A it doesn't get increase 
 System.out.println(ab--);       //@
  



 

    
    
    
    
 
	



}


}
