package session11;

public class _1_EcomSearch {
	
	public void search() {
		System.out.println("search method with 0 parameter");
		
	}
	
	public void search(String ProductName , int price) {
		System.out.println(" Search with 2 parameters - " + ProductName + " " + price );
		
	}
	
  public void search (String ProductName , int price , String seller) {
	  System.out.println("Search with 3 parameters - " + ProductName + " " + price + " " + seller );
	  
  }
  
  public void payment (long ccNumber) {
	  
	  System.out.println(" search witch 1 parameter -" + ccNumber);
	  
  }
  
  public void payment (long ccNumber,int pin ) {
	  System.out.println(" search with 2 parameter -" + ccNumber + " " + pin );
	  
  }
  
  public void payment (long ccNumber,int pin , String cardHoldersName ) {
	  System.out.println(" search with 3 parameter -" + ccNumber + " " + pin + " " + cardHoldersName );
	    
  }

  public static void main(String[] args) {
	
	  _1_EcomSearch objRef = new _1_EcomSearch();
	  
	  // search 
	  objRef.search();
	  objRef.search("Mobile",5000 );
	  objRef.search("Laptop", 30000, "phonex Enterprices");
	  System.out.println("-----------------------------------------------------------------------------------" );
    
	//  payment
     
	  objRef.payment(458962);
	  objRef.payment(458962, 413709,"A");
	  
	  
	  
	  
}
  
  
  
  
  
  
}
