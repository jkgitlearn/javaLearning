package javaLearningbasics;

public class Operators {

	public static void main(String[] args) { //arthemetic operators
		int dolly=19;
		int shilpa=7;
		//dolly/=shilpa;
		
		
	dolly%=shilpa;
		
		System.out.println("Value of shilpa is :"+shilpa);
		System.out.println("Value of dolly is :"+dolly);				
	}
}


class Operators_Day28_2 {

	public static void main(String[] args) 
    {
		int a=21;
		int b=2;
		int c=a%b; //returns remainder
		
		System.out.println(c);
		
		//addition of a: dynamic value and b: dynamic value and c is: dynamic value
		
		System.out.println("addition of a " + a + " and b: " + b + " and c is " + c);

	}

}


class Operators_1_Day28_2 {
	public static void main(String[] args) {                   //arthemetic operators
	                                     
		int x=12;
		int y=10;
		int z =x/y;
		
		System.out.println(z);
   }
}	
		
/*Java divides the operators into the following groups: 
1.Arithmetic operators: +(x+y),-(x-y),*(x*y),/(x/y quotient),%(x%y remainder),
2.increment/decrement operators----> ++(++x increase by 1),--(--x decrease by 1)
3.Assignment operators: =, +=, -=, *=, /=, %=, >>,<<,|=,[ like ex: x+=3 -------> x=x+3              ]
4.Comparison/relational operators: ==, !=[not equal to], >,<,>=,<=[x==y, x>=y, so on]
5.Logical operators: &&----->[returns true if both statement is true] 
                     ||---->(returns true if one ot the statement is true)
                     !---->[reverse the result return false, if the result is true]
*/




class AssignmentOperators{
public static void main(String[] args) {
		
		int x=88;
		System.out.println("Value of x is :"+x);
		
		x+=12;//x=x+12
		System.out.println("Value of x after changing is :"+x);
		
		int y=99;
		y-=x;//y=y-x;
		System.out.println("Value of x is :"+x +" & Value of y is :"+y);
		
		y*=10;//y=y*10
		System.out.println("Value of y is :"+y);
		
		int z=500;
		z/=x;//z=z/x;
		System.out.println("Value of z is :"+z);		
	}		
}

class AssignmentOperators_1{
	public static void main(String[] args) {          //assignment operators

		int a= 100;
		System.out.println(a);
		a+=10;
		System.out.println(a);
	}
}



class Logical_Operator1 {
	public static void main(String args[]){
		int a=10, b=45, c=22;
		
		boolean e=((a<c) || (a>b));
		System.out.println(e);//true
		
		boolean d=((a<c) && (a>b)) || (b>c);
		System.out.println(d);//true
		
		boolean f= (a<10) ^ (100<=200);
		System.out.println(f);
	}
}

class Logical_Operator2{
	
	public static void main(String[] args) {
		int a=95, b=68;
		
		boolean c=(a>b) && (a==b);
		System.out.println("c ="+c);//false
				
		System.out.println((a>b) && (a==b));//false
		
		System.out.println((a>b) || (a==b));//true
	}	
}

class Relational_OPerator1 {

	public static void main(String[] args) {
		
		int x=40, y=50;
		
		boolean z=x>y;
		System.out.println("value of z is :"+z);
		
		System.out.println(x<y);
		
		boolean a= y<=100;
		System.out.println("Value of a is :"+a);
		
		boolean b =20>=x;
		System.out.println("Value of b is :"+b);
		
		System.out.println(x==y);
		System.out.println(40==x);
		
		System.out.println(y!=50);
		System.out.println(x!=y);				
	}	
}

class Relational_OPerator2 {
	public static void main(String[] args) {
		int a=10, b=99;
		System.out.println(a>b);//false
		boolean c=a>b;
		System.out.println(c);//false
		
		b=2;
		boolean d=a<50;
		System.out.println(d);//true
		
		boolean e= a<=10;
		System.out.println(e);//true
		
		boolean f=b>=80;
		System.out.println("The value of f is :"+f);//false
		
		System.out.println(a==b);//false
		System.out.println(a==10);//true
		
		System.out.println(b!=a);//true
		System.out.println(b!=2);//false
	}
}

class Ternary_Operator1 {
	public static void main(String[] args) {
		int x=10;
		
		int y=20;
		
		int z=(x<y)?x:y;
		System.out.println("Value of z is :"+z);
		
		z=(z<=100)?60:75;
		System.out.println("Value of z is :"+z);
	}
}

class Ternary_OPerator2{
	
	public static void main(String args[]){
		char ch='G';
		char x1=(ch==99)?100:'G';
		int x2=(ch==99)?100:'G';
		System.out.println("x1 value is :"+x1+" x2 value is :"+x2);
		
		int x=89, y=100,z;
		z=(x>y)?x:y;
		System.out.println("z value is :"+z);
		
		z=(x<y)?300:500;
		System.out.println("z value is :"+z);
	}
	
}

