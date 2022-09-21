package methods_day31_5;

public class Methods_Static {
	
	//accessmodifier, return type, method name(args/parameters)
	 // 1. a method with no return type and no args/parameters
		
	    public static void sumOfTwoNums() {
	    	int a =12;
	    	int b=13;
	    	int c = a+b;
	    	System.out.println(c);
	    }
	       
	    // 2.a method with no return type and have args/parameters
	    
	    public static void sumOfTwoNums1(int a, int b) {
	        int c= a+b;
	    	System.out.println(c);
	    }
	    
	    //3. a method with  return type and args/parameters
	    
	    public static int sumOfTwoNums3 (int a, int b) {
	        //int c= a+b;
	    	//System.out.println(c);
	    	return a+b;  //return c;
	    }	
	    
	    //4. a method with  return type and no args/parameters
	    
	    public static int sumOfTwoNums2() {
	    int a =11;
    	int b=11;
    	int c=a+b;
    	//System.out.println(c);  // either u can write here or in main method when u call
    	return c;
	    }
	    
	 // write a program to create 4 methods. 1---> method which does multiplication of 2 int numbers
	 //(should not return anything and no args also)
	
	           static void multiplicationOfTwoNums() {
	            int x = 12;
	            int y = 13;
	            int z = x * y;
	            System.out.println("Multiplication of 2 integers " +x +" * " +y+ " is: " + z);
	           }
	           
	 // method which does addition of 3 double numbers (should return a value and also have args and parameters)
	   	    
	               static double sumOfThreeNums(double a, double b, double c) {
	               double d= a+b+c;
	               System.out.println("addition of 3 double numbers is " +d);
	               return d;
	           }	
	               
	   	public static void main(String[] args) {
		
		        sumOfTwoNums();
		        sumOfTwoNums1(1,3);
		        System.out.println(sumOfTwoNums2());
                System.out.println(sumOfTwoNums3(8,9)); //sumOfTwoNums3 (8,9);  
                                                       //if u didn't write syso in class u write here in main method either ways u can
                                                      //write. check in green comment for same program
		        multiplicationOfTwoNums();
	            sumOfThreeNums(22.2,33.3,44.4);	              
	}
}
 
