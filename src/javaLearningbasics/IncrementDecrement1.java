package javaLearningbasics;

public class IncrementDecrement1 {

	public static void main(String[] args) {
		
		int a=45;
		int b=a--;
		System.out.println("b= "+ b);//45
		System.out.println("a= "+ a);//44
        
        int x=5;
		int y=(x++) + (++x) + (--x);
		//5+7+6
		System.out.println("x= "+x);//6
		System.out.println("y= "+y);//18
	}
}


class IDPractice {
	public static void main(String args[]) {
		int i=5;

		i=(i--) + (i++) + (i--) + (--i) + (++i);
			//5+4+5+3+4
		System.out.println(i);//21
	}
}

class IDPractice1{
	public static void main(String args[]) { 
	   int math=98;
	   int english=95;
	   int science=99;
	   
	   int total=(math++) + (++math) + (--english) + (science--) + (++science);
	  
			//		98			100			94			99			99
	   
	   System.out.println("math= " +math);//100
	   System.out.println("english= "+english);//94
	   System.out.println("science= "+science);//99
	   System.out.println("Total= "+total);
	   
	}
}
