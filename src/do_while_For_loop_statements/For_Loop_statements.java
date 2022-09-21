package do_while_For_loop_statements;

public class For_Loop_statements {

	public static void main(String[] args) {
				                                  			
				int b=223;               // reverse number in for loop
				int r=0;
				for(int n=b; n!=0; n/=10) 
				{
					int t=n%10;
				    r= r*10+t;
				}
				if(r==b)
				{	
					System.out.println("reveresd number " + r + "  is  a palidrome");
				}
				else
				{
					System.out.println("reveresd number " + r + "  is not a palidrome");
				}
	}	 			
}
	
class For_Loop_Statements1{                             // write sum of first and last digits are equal to the middle number
	
	public static void main(String[] args) {
		
		int b=154;
		int ld=0;
		int fd=0;
		int t =0;
        for(int a=b; a!=0; a/=10)
		{
			ld=a%10;
			while(a!=0) 
			{
				fd=a%10;
				a/=10;
			}
		    t = ld+fd;
		}
        if(t==fd)             //confused            
   	 {
      	  System.out.println(b+ "="+" sum of first and last digits "+fd+"+"+ld+ "="+t+ " is  equal to the middle number");   		 
   	 }
   	 else
   	 {   	
   	  System.out.println(b+ "="+" sum of first and last digits "+fd+"+"+ld+ "="+t+ " is not equal to the middle number");
   	 }
        
	}   	
	
}
