package methods_day31_5;

public class Cat extends Animal_Oops {           // created another class cat, but this is public class in different file
	                                             
	public void walking() {                  // over ride for walking method it was created in animal class b4 and now 
		System.out.println("this is from cat class");  //its overridden in cat class with same method name and parameters
	}
	

	public static void main(String[] args) {
		
		Cat c1 = new Cat();          //object created inherited from animal class
		c1.walking();                // first the object search it has any walking method in the same cat class if it is
		                             //  it executes other wise it goes to the parent class which is animal and 
                                      // search for walking method and executes	
		
	//  Animal_Oops ao= new Animal_Oops();
	//	ao.eating();
	//  dog d = new dog();
	//d.eating();
		
	}                                
}
