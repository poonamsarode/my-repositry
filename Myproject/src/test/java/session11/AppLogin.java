package session11;

public class AppLogin {
	
	public void login() {
		System.out.println(" Login with a parameter");
		System.out.println(" User got logged in");

		
	}                                                     //Overloading a single method with different parameters

	public void Login(String username) {
		System.out.println(" login with 1 parameter -" + username);
			                                               
	}	
	
	public void Login(String username,String password) {
		System.out.println("Login with 2 parameter - "+ username + " " + password);
	}
	
	public void Login(int otp) {
		System.out.println(" Login with 1 parameter -" + otp);
		
	}
	public void Login(long phonenumber,String password) {
		System.out.println(" Login with 2 parameter - "+ phonenumber + " " + password);
		
	}
	
	public void Login(String emailID,int otp) {
		System.out.println(" Login with 2 parameter - "+emailID  + " " + otp);
		System.out.println(" User got logged in");

	}

	public static void main(String[] args) {
		
		AppLogin refVar = new AppLogin();
		
		refVar.login();
		refVar.Login(235469845, "3456pass");
		refVar.Login(4563);
		refVar.Login("test@gmail.com", 4569);
		
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
