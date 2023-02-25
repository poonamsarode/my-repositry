package session8;

public class WebPage {
	
                      
	// create web page 
	String title = " welcome to amezon";
	String url = "htpp://www.amezon";
	String header = "Amezon is ecommerce platform to sell stuf ";
	String logo = "htps://www.amezon.com";
	
	public void topPannel()               // section of page
	{
		System.out.println("---------------------------title of ameazon ---------------------------------------------");
		System.out.println(" url");
		System.out.println(" this is top pannel of ammezon");
		System.out.println(" logoImage");
		System.out.println("------------------------------------------------------------------------------------------");

	}
		
	public void footerlinks() 
	{           
              // logic 
	System.out.println("----------------------------------------------------------------------------------------------");
	System.out.println("About us");
	System.out.println("carrears");
	System.out.println("press relases");
	System.out.println("amezon cares");
	System.out.println("----------------------------------------------------------------------------------------------");
	}
	
	public void centerPannel()
	{
		System.out.println("-------------------------------center pannel-----------------------------------------------------------");
		System.out.println("mobile");
		System.out.println("laptops");
		System.out.println("book");
		System.out.println("----------------------------------------------------------------------------------------------");
	}
	
	public static void privacyPolicy()
	
	{
		System.out.println("-------------------------------------privacyPolicy--------------------------------------------------------");
		System.out.println("-------------------------------------about amezon-------------------------------------------");
		System.out.println("-------------------------------------amezon vendors--------------------------------------------");
		System.out.println("-------------------------------------privacy constant------------------------------------------");
		
	}
		                             //create an object ,object created inside a main method 
		
	public static void main(String [] args) {
		
//	WebPage refVariable = new WebPage();
//    System.out.println(refVariable.title);        
//	System.out.println(refVariable.url);
	
//	refVariable.topPannel();                      //no need to print stetment 
//    refVariable.centerPannel();
    
    WebPage landingPage = new WebPage();
	System.out.println(landingPage.title);        
	System.out.println(landingPage.url);
	
	landingPage.topPannel();                      //no need to print stetment 
	landingPage.centerPannel();
    
   privacyPolicy();                    //no object creat becoz it is a static   IMP
    


	
		
		
		
		
		
		
		
		
	}
	
	
	
	
	

}
