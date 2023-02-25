package session5;

public class ArrysInJava {
	
private static int k;

public static void main(String[] args) 
{
                // Arrays is use to store multiple values in a same variable
	
	//int a = 2;
	int b = 4;
	int c = 6;
    int d = 8;
    int e = 10;
    
 //   int[] q = new int[4];    // 0 1  2 3   this also

    int x[] = new int[5];   // 0 1 2  // this is acceptable     

 //    int[]y = new int [2]; // 0 1       this also

//    int z[] = {10,20,30};      // 0 1 2 
    
    x[0] = 10;
    x[1] = 20;
    x[2] = 50;
    x[3] = 99;
    x[4] = 105;
    
    System.out.println(x[2]);
    System.out.println(0);
    System.out.println(x[0] + x[1]);
    
   System.out.println(x.length);                // calculate length of Array
                         
   System.out.println("............................................................................");
                                              // create iterate 
//   for(int k = 0; k <x.length; k++)
//  {
//    System.out.println(x[k]);
//  }

                                     // on witch index no the value is available 
//   if(x[k] == 99)
// {
//     System.out.println("the index number for value "+ x[k]+ "is : " + k );
//   }   

	   
 //  double k1 [] = new double [5];
 //         k1[0] = 12.35;
//	   k1[1] = 45.56;
		  // k1[2] = 78.99;
		 //  k1[3] = 88.89;
		//   k1[4] = 66.45;
	//	System.out.println("length of the double array naming k1 is" + k1.length);
	//	 System.out.println(k1[2]);
		
   //	String browsers[] = new String[4];
     // 	browsers[0] = "crome";
   	//   	browsers[1] = "opera";
  	//   	browsers[2] = "firfox";
   	//   	browsers[3] = "egde";
   		   	
    //  	browsers[1] = "edge";
   	//   	for(int l = 0; l<browsers.length; l++)
   	//  	{
   	//   		System.out.println(browsers[l]);
   	//  	}	
   		   		
   	                                            // Object array 
   		   	
   		   	Object emp[] = new Object [5];
   		   	
   		   	emp[0] = " ABC";
   		   	emp[1] =   34;
   		   	emp[2] =   999;
   		   	emp[3] =  'M';
   		  
   		   	
   		   	for(int a = 0; a<=emp .length; a++) 
   		   	{
   		   	  System.out.println(emp[a]);

   		   	}
	
   }	
	
}	
	
	

	
	
	
	
	
	



