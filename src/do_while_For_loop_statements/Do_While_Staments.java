package do_while_For_loop_statements;

public class Do_While_Staments {

	public static void main(String[] args) {
		
				int number = 13;
				int a = 0;
				int b = 1;
				int s = 1;
				
				do {
					System.out.println(a);
					int sum = a+b;
					a=b;
					b=sum;
					++s;
				}while(s<13);
	}
}

class Do_While_Staments1 {
	
	public static void main(String[] args) {
	int a=101;
		do {
			System.out.println(a);
			a++;
		}while(a<=100);
		
		
	}	
}

//print 200 to 1 using  do loop

class Do_While_Staments2 {
	
	public static void main(String[] args) {
		int a =200;
		do {
			System.out.println(a);
			a--;
		}while(a>=1);

	}
}
