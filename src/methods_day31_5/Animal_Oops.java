package methods_day31_5;

public class Animal_Oops {

	public void eating() {                    // non static method created
		System.out.println("this is from animal class + eating method");
	}
	
	public void sleeping() {                  // non static method created
		System.out.println("this is from animal class + sleeping method");
	}
	
	public void walking() {                   // non static method created
		System.out.println("this is from animal class + walking method");
	}
	
	public static void main(String[] args) {
		

	}

}

class dog extends Animal_Oops{                     // this is class dog, but without public its in same file 
	                                               // but different class may be called sub-class
	public void eating() {
		System.out.println("this is from dog class + over ride eating method");  // override with same method name and parameters
	} 

	public static void main(String[] args) {
		dog d1 = new dog();                  // object created from dog class
		d1.eating();                         
		Animal_Oops d2 = new Animal_Oops();     // object created from animal class
		d2.eating();                            // inherited from animal class 
                                               // this is over ride too from animal class both are eating object created
	}                                         //but one from dog class and other from animal vlass
	
}

