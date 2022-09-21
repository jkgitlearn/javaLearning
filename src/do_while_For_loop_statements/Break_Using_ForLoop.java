package do_while_For_loop_statements;

public class Break_Using_ForLoop {

	public static void main(String[] args) { // continue printing 1234 until j=5
		
		for(int i=1; i<=8; i++) 
		{		
			for(int j=1; j<=10; j++) 
			{
				if(j==5)
				{
				 break; // just a break to stop the loop continuation instead going until ten it stopped to 5 because the loop has been put break till 5
				}			
			     System.out.println(j);
			}
		}	
	}
}


class Break_Using_ForLoop1 {
	
	public static void main(String[] args) {
		
		red: for(int a=10; a>=6; a--) 
		{		 
			yellow:for(int b=1; b<=5; b++) 
			{			
				if(b==3) 
				{
					break red; //when break is mentioned to the LABLE it stops executing either outer or inner loop
				}
				System.out.println(b);
			}
		}
	}
}