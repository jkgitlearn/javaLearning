package do_while_For_loop_statements;

public class Continue_Break_UsingForLoop {

	public static void main(String[] args) {
		
		for(int a=1; a<=5; a++) 
		{
			if (a==5) 
			{
				System.out.println("trying to write program with continue");
				continue;
			}			
			for(int b=a; b<=3; b--) 
			{
				if (b==1) 
				{		
				System.out.println("trying to write with break");
				}
				break;
			}				
		}	
	}
}
