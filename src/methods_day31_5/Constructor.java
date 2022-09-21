package methods_day31_5;

public class Constructor {   //default constructor with no parameters
	
	boolean id;
	String name;
	
	public void displayDetails() {             // method creation non static
		System.out.println(id + " " + name);   //default constructor no parameters passed
	}
	
	
	public static void main(String[] args) {
		Constructor t1 = new Constructor();     //created object calling method /cnstructur which is in class/
		Constructor t2 = new Constructor();     // default constructor with no parameters---->()
		t1.displayDetails();		            // output is false, null because no parameters passed--> java compiler pass those false and null which is default constructor
		t2.displayDetails();
	}
	
}



class Constructor1{           //parameterized constructor passing parameters having arguments
	
	int id;
	String name;
	
	Constructor1(int i, String n){    // Constructor created & is given parameters so it is pamaterized conctructor
	id=i;                             // and it has a same class name
	name=n;
	System.out.println(id + " " + name);
		
	}	
	
	//public void displayDetails() {                                 //non static method creation
	//	System.out.println(id + " " + name);
//	}
	
	//public void displayInformation() {                            // non ststic method creation for just id 
	//	System.out.println("i only want the id informaation " +id);
	//}
	
	public static void main(String[] args) {
		Constructor1 m = new Constructor1(1,"john");
		Constructor1 n = new Constructor1(2,"max");
		Constructor1 o = new Constructor1(3,"lilly");
		
	//	m.displayDetails();
	//	n.displayDetails();
	//	o.displayDetails();
	//	o.displayInformation();
		
		
	}		
			
}


class Constructor2{              //constructor overloading
	
	int id;
	String name;
	int age;
	
	Constructor2(int i, String n){    // Constructor created & is given parameters so it is pamaterized conctructor
	id=i;                             // and it has same class name
	name=n;
	}
	//System.out.println(id + " " + name);
	
	Constructor2(int i, String n,int a){    // Constructor over loading with different number of parameters
		id=i;                             
		name=n;
		age=a;
		
	}	
	
	public void displayDetails() {       //non static method creation
		System.out.println(id + " " + name + " " + age);    // u can just take out age and also create another
	}                                                       // method creation just like line 81
	
	//public void displayDetails1() {       //non static method creation
	//	System.out.println(id + " " + name + " " + age);
	//}
	
	public void displayInformation() {    // non static method creation for just id 
		System.out.println("i only want the id informaation " +id);
	}

	public static void main(String[] args) {
		
		Constructor2 m = new Constructor2(1,"john");
		Constructor2 n = new Constructor2(2,"max");
		Constructor2 o = new Constructor2(3,"lilly");
		Constructor2 p = new Constructor2(3,"lilly", 33);
		
		m.displayDetails();
		n.displayDetails();
		o.displayDetails();
		o.displayInformation();	
		p.displayDetails();
	}		
}	
	
	
	
	
	
	
	
