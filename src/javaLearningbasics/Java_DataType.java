package javaLearningbasics;

public class Java_DataType {

	public static void main(String[] args) {
		
		System.out.println("dashdkajshdak ");
		int shilpa=150;// int --> Data Type ; Shilpa --> Identifier name(variable) --> 150 Literal
		long shilpabangalore=20;
			
		/*int z=x+y;
		System.out.println("Value of z is :"+z);//170
		
		x=x+z;
		
		System.out.println(x);//320
		System.out.println(y);//20
		
		System.out.println("Value of x is: "+x);//320
		y=y-x;
		System.out.println("Value of y is: "+y);//-300
		
		System.out.println("Value of x is: "+x+" & Value of y is: "+y);*/
		
		byte a=1;
		System.out.println("Value of a is :"+a);
		
		short shil=25678;
		System.out.println("Value of shil is :"+shil);
		
		int doll=789234723;
		System.out.println("Value of sagar is :"+doll);
		
		long d=7892347230L;
		System.out.println(d);
				
		int doll_abc='A'; //returns the value in number of ascii because it is int datatype given in char a
		System.out.println(doll_abc);
		
		long g='c';
		System.out.println(g);
		
		float abcd=78.56f;
		System.out.println("Value of abcd is :"+abcd);
		
		double xyz=679789.54;
		System.out.println("value of xyz is :"+xyz);
		
		float shil_1=67;
		System.out.println(shil_1);
		
		double shil_2='H';
		System.out.println(shil_2);
		
		//double shil_3=null;
	}
}

class DataType{
	
public static void main(String args[]){
		
		char sagar='g';
		System.out.println(sagar);
		
		sagar='H';
		System.out.println(sagar);
		
		char shilpa=100; //returns ASCII value bcoz its given number 100
		System.out.println(shilpa);
		
		boolean b=true;
		System.out.println(b);
		
		boolean shilpa_bangalore=false;
		System.out.println(shilpa_bangalore);		
	}
		
}

class DataType1{
	
	public static void main(String[] args) {
		byte a=5;
		System.out.println(a);
		
		//byte b=130;
		
		short c=130;
		System.out.println(c);
		
		//short d=40000;
		
		int e=40000;
		System.out.println(e);
		
		//int f=9999999999;
		
		long g=40000L;
		System.out.println(g);
		
		long h=9999999999L;
		System.out.println(h);
		
		double xyz=321.34;
		System.out.println(xyz);
		
		float abcd =67.443f;
		System.out.println(abcd);	
	}		
}

class DataType2 {
    public static void main(String args[]) {
   
   	 int x=25;
   	 int y=44;
   	 int z=x+y;
   	 System.out.println("value of z is: "+z);
   	 System.out.println("value of z is: z");
   	 
   	 x=35;
   	 System.out.println("value of x is: "+x);
   	 
   	 x=x+y;
   	 y=y+x;
   	 System.out.println(x);
   	 System.out.println(y);
   	 
   	 
   	 System.out.println("value of x is: "+x+ " & value of y is: "+y);
   	 
        int fun='S';//same for int,byte,short,long
        System.out.println(fun);//comes o/p always as integer/number(ASCII) even if given as char.
   	 
        char myLetter= 'r';
        System.out.println(myLetter);
        
        char myNumber= 100;// comes o/p always as char (ASCII)even if number is assigned
        System.out.println(myNumber);// just opposite to int
    }
}






