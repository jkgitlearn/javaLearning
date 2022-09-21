package methods_day31_5;

public class Kitten extends Cat {
	
	public void walking() {                             // over riding from cat class with same method andparameters
	System.out.println("this is from kitten class");    // and change accordingly to ur need
	}

	public static void main(String[] args) {
		Kitten k = new Kitten();
		k.walking();
		//k.sleeping();
	}

}
