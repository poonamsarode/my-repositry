package session12;

public class _3_TestCar {
	
// creat a class obj of BMW
	
public static void main(String[] args) {
	
_2_BMW b = new _2_BMW();         //child class object referd by child class reference 

//b.Stop();
//b.Start();
//b.fillfuel();
//b.autoParking();	
//b.engine();

System.out.println("-------------------------------------------------------------------------------");
  

_1_Car c = new _1_Car();   // parent class object referd by parent class reference 

   
 //  c.Stop();
 //  c.Start();
 //  c.fillfuel();
 //  c.engine();
   // c.autoparking
}	
	
// top casting / up casting 
_1_Car c1 = new _2_BMW(); //  parent class object referd by parent class reference 
{

c1.Stop();
c1.Start();
c1.fillfuel();
//c1.autoParking();	
c1.engine();

}

//_0_Vehicle v = new _2_BMW();
{

//	v.engine();
	
	
//	 _2_BMW z = new _1_Car();  // not allowed //50 50 %
	
	
	 _2_BMW z = (_2_BMW) new _1_Car(); 
	
	z.autoParking();
	z.engine();
    z.Start();              // Exception got change  
    z.Stop();





}

	
	

}
