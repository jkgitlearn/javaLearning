package javaLearning_if_else;

public class If_Else_Statements_29_3 {

	public static void main(String[] args) {
		
		int a=65;
	    int b=65;
	    int c=65;
	    
	           if (a > b)
	           {	   
	        	   if (a > c) 
	        	   {
	        		   System.out.println("The greatest number is : " + a);
	        	   }
	           }
	    	  if (b > a)
	    	  {
	    		  if (b > c)
	    		  {
	    			  System.out.println("The greatest number is: " + b);
	    		  }
	    	  }
	    	  if (c > a)
	    	  {
	    		  if (c > b)
	    		  { 
	    			  System.out.println("The greatest number is: " + c);
	    		  }
	    	  }
	    	  else     		  
	    	  {
	    		  System.out.println("no greatest numbers");
	    	  }
	}
}


class If_Else_Statements_1{
	public static void main(String[]args) {
		int p=288,q=289,r=299;// find the greatest numbers
		
		if(p>q && p>r) {
			System.out.println("p is greatest " +p);	
		}
		if(q>r && q>p) {
			System.out.println("q is greatest " +q);
		}
		else {
			System.out.println("r is the greatest " +r);
		}
	}
}


class If_Else_Statements_2{
	public static void main(String[]args) 
	{
		
		/*1.if user age is above 21 print user passed age check
		  2. if user age is above 21 and the country code is U print user is eligible to vote as
		  both age check and country check are pass
		  3. if they failed the age check print user is not eligible to vote as age check failed
		  4. if they passed age check and failed country check print user is not eligible to vote
		  bcoz they passed age check but failed country check */
int age=22;
char c= 'U';
		
if (age>21) 
{
	System.out.println("user passed age check");
	  
if (c =='U') 
  {
	System.out.println("user is eligible to vote as both age check and country check are pass");
  }else
  {
    System.out.println("user is not eligible to vote because they passed age check but failed country check");
  }
						
} else
  {
	System.out.println("user is not eligible to vote as age check failed");
  }				
}
	
}



class If_Else_Statements_3 {

	public static void main(String[] args) {
		
int age =18;
		
		if (age>=21) {
			System.out.println("eligible to vote");
		}else {
			System.out.println("not eligible to vote");
		}
	}

}
