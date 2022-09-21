package do_while_For_loop_statements;

import java.util.Scanner;

public class While_Loop_statements {

	public static void main(String[] args) {
		
		int n=12345;            //reverse number in while loop
		int r=0;
		while(n!=0) 
		{
			int t=n%10;
			r=r*10+t;		
		     n/=10;
		}
		System.out.println("reveresd number " + r + "  is a palidrome");	
	}
}


class While_Loop_Statements1 {
	
	public static void main(String[] args) {
		
		int p;
		 Scanner s = new Scanner(System.in);
		 p =s.nextInt();    //7>=1--->true, 7/1= 0 which is true, count=0+1=1, s++=1+1=2
		int S=1;           //7>=2--->true, 7/2= 1 which is false, count=0+1=1, s++=2+1=3....keep going with 3,4,5,6,
		int count =0;      //7>=7--->true, 7/7=0 which is true,   count=1+1=2, s++=7+1=8 
		                   // 7>=8--->false the loop breaks here and goes to if statement and prints the answer
		while (p>=S) {
			if (p%S==0) {
				count=count+1;
			}
			S++;
		}
		if (count==2) {
		   System.out.println(p + " is a prime number");
		}
		else {
			System.out.println(p + " is not a prime number");
		}
	}    
}



class While_Loop_30_4 {

	public static void main(String[] args) {
		int a=1;
		
		while (a<=100)                            //while loop
		{
			System.out.println(a);
			a++; //a=a+1
		}		
	}
}


class While_Loop1_30_4 {

	public static void main(String[] args) {            //print 1 to 200 using for  loop
		
	     int a;
		for(a=1; a<=200; a++)
		{
		    System.out.println(a);
		}   
	}
}

class While_Loop2_30_4 {

	public static void main(String[] args) {              //print 200 to 1 using for  loop
			
		int a;
		for(a=200; a>=1; a--)
		{
		    System.out.println(a);	
		}
	}
}
		
		                                             
class While_Loop3_30_4{                              //print 1 to 200 using  while loop
	public static void main(String[] args) {
		int a=1;
	while (a<=200) {
		System.out.println(a);
		a++;
	}
	
	}
}

