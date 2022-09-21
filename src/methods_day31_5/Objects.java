package methods_day31_5;

public class Objects {
	
	int c=3;
	int d=5;
	int a;
	
	
	public int test() {       //created a method not static method
		//d=5;                // u can declare the variable here or in class objects
		//c=3;
		a=c+d;
		System.out.println(a);
		return a;
		
	}

	public static void main(String[] args) {     //object creation to call test method non static method
		
		Objects ob = new Objects();
		ob.test();
		
	}

}
