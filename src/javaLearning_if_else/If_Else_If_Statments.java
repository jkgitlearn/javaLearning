package javaLearning_if_else;

public class If_Else_If_Statments {

	public static void main(String[] args) {
		
		//take three numbers and print the greatest number
					
				int p=25, q=87, r=78;
				
				if (p>q && p>r) {
				   System.out.println(p + " is the largest number");
				}  
				   else if (q>p && q>r) {
					   System.out.println(q + " is the largest number");	
				   }   
					   else {
						   System.out.println(r + " is the largest number");
					   }
	   	}
}



