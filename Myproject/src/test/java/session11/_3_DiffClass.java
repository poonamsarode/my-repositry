package session11;

public class _3_DiffClass {
	
public static void main(String[] args) {
	
	AppLogin appLogin = new AppLogin();
	
	appLogin.login();
	appLogin.Login("TestUser");
	
	_1_EcomSearch ecomSearch = new _1_EcomSearch();
	
	ecomSearch.payment(458962);
	ecomSearch.search("mobiles", 5000);
	
	
	
}	
	

}
