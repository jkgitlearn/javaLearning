package methods_day31_5;

public class Method_OverLoading {       // created same static method with different parameters and datatype
	                                    // its called method overloading
	public static void sumNums(int a, int b) {
		int c=a+b;
		System.out.println(c);
	}
	
	public static void sumNums(int a, int b, int c) {
		int d=a+b+c;
		System.out.println(d);
	}
	public static void sumNums(double a, double b) {
		 double c=a+b;
		System.out.println(c);
	}
	
	

	public static void main(String[] args) {
		
			
	}
}
