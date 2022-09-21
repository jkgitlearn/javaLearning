package javaLearningbasics;

public class Increment_Decrement {

	public static void main(String[] args) {
		
		int x=5;
		++x;//Pre Increment operator
		System.out.println("Pre Increment operator --> "+x);
		
		x++;//Post Increment operator
		System.out.println("Post Increment operator --> "+x);
		
		--x;//Pre Decrement operator
		System.out.println("Pre Decrement operator --> "+x);
		
		x--;//Post Decrement operator
		System.out.println("Post Decrement operator --> "+x);	 
	}
}


class Increment_decrement1{
	public static void main(String[] args) {
		int x=5, y=5, z=5, a=5;
		
		System.out.println(++x);//6
		
		System.out.println(y++);//5
		System.out.println(y);
		
		
		System.out.println(--z);//4
		System.out.println(z);
		
		System.out.println(a--);//5
		System.out.println(a);
	}
}

class Increment_Decrement2 {
	public static void main(String[] args) {
		int a=45;
		int b=a--;
		System.out.println("b= "+ b);//45
		System.out.println("a= "+ a);//44
		
		int x=5;
		int y=(x++) + (++x) + (--x);
			//  5       7       6
		System.out.println("x= "+x);
		System.out.println("y= "+y);
	}
}

class Increment_Decrement3 {
	public static void main(String[] args) {
		int ch=50;
		
		ch++;
		System.out.println(ch);//51 
		ch++;
		System.out.println(ch);//52 
		++ch;
		System.out.println(ch); //53
		++ch;
		System.out.println(ch); //54
		System.out.println("---------------------");
		
		
		int ch1=50;
		System.out.println(ch1++);//50 
		System.out.println(ch1++); //51
		System.out.println(++ch1); //53
		System.out.println(++ch1); //54
	}
}

class Increment_Decrement4 {

	public static void main(String[] args) {
		int x=100;
		System.out.println("Inital x value :"+x);
		
		System.out.println("x value :"+ ++x); // Pre Increment
		System.out.println("Final x value :"+x);
		
		int y=200;
		System.out.println("Inital y value :"+y);
		
		System.out.println("y value :"+ y++); // Post Increment
		System.out.println(y++);
		System.out.println(y);
		System.out.println("---------------------------------");
		
		
		int a=100;
		System.out.println("Inital a value :"+a);
		++a;
		System.out.println("a value is: "+a);
		System.out.println("Final a value is"+a);
		System.out.println("---------------------------------");
		
		
		int b=200;
		System.out.println("Inital b value :"+b);
		b++;
		System.out.println("b value is: "+b);
		System.out.println("Final b value is"+b);
		System.out.println("---------------------------------");
		
		
		int m=500;
		System.out.println(m--); //500
		System.out.println(--m); //498
		System.out.println(m); //498
		System.out.println("---------------------------------");
	
		
		int i=5;

		i=(i--) + (i++) + (i--) + (--i) + (++i);//20
		//  5       4       5       3       4	
		System.out.println(i);		
	}	
}


