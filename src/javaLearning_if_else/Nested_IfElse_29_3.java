package javaLearning_if_else;

public class Nested_IfElse_29_3 {

	public static void main(String[] args) {
		
		// greatest numbers between 5 numbers
		
				int a=122,b=223,c=124,d=25,e=126;
				
			    if(a>b && a>c && a>d && a>e) 
			    {
			       System.out.println("greaatest number is " +a);	    	
			    }
			    if(b>a && b>c && b>d && b>e) 
			    {
			       System.out.println("greatest number is " +b);
			   	}
		        if(c>a && c>b && c>d && c>e)
			   	{
			       System.out.println("greatest number is " +c);
			    }
		        if(d>a && d>b && d>c && d>e) 
		        {
			       System.out.println("greatest number is " +d);
			   	}if(e>a && e>b && e>c && e>d)
				{
				   System.out.println("greatest number is " +e);
		        }          
			}
		}

		class Nested_If_else_1{
			public static void main(String[] args) {
			
			int l=800,m=2300,n=604,o=409,p=280; //result is  ok working  
				
			if (l>m) 
			{
		        if (l>n) 
		        {
		            if (l>o) 
		            {
		            	if(l>p) 
		               {
		                 System.out.println("greatest numner is " +l);
		               }else 
		                {
		            	  System.out.println("greatest numner is " +p);
		                }
		            }	
		        }    	           	
		    }
			 if(m>n) 
			 {
				 if(m>o && m>l)
				 {
					 if(m>p)
					 {
						 System.out.println("greatest number is " +m);
					 }else
					 {
						 System.out.println("greatest number is " +p);
					 }
						 
				 }
			 }
			if(n>l)
			{
				if(n>o && n>m)
				{
					if(n>p)
					{
						System.out.println("greatest number is " +n);
					}else
					{
						System.out.println("greatest number is " +p);
					}
				}
			}
			if(o>l)
			{
				if(o>m && o>n)
				{
					if(o>p)
					{
						System.out.println("greatest number is " +o);
					}else
					{
						System.out.println("greatest number is " +p);
					}
				}
			}
			/*if(p>l)
			{
				if(p>m)
				{
					if(p>n)
					{
						if(p>o)
					  {
						System.out.println("greatest number is " +p);
					
					  }else
					     {
						   System.out.println("greatest number is " +m);
					     }
					}	
				}
			}*/
			
			}	
		}



		class Nested_If_else_2 {
		public static void main(String[] args) {
         int a=10, b=20, c=30;
		
		if (a>b) 
		{
			if(a>c)
			{
				System.out.println("a is greatest "+a);
			}else
			{
				System.out.println("c is greatest "+c);
			}
		}else
		{
			if(b>c)
			{
				System.out.println("b is greatest " +b);
			}else
			{
				System.out.println("c is greatest " +c);
			}
		}
	}
}



class Nested_Else_If_3{
	public static void main(String[] args) {
		
	int day = 3;
	
	if (day==1) 
	{
		System.out.println("monday");
	}else if(day==2)
	{
			System.out.println("tuesday");
	}else if(day==3) 
	 {
		System.out.println("wednesday");
	 }else if(day==4) 
	 {
		System.out.println("thursday");
	 }else if(day==5) 
	{
		System.out.println("friday");
	}else if(day==6) 
	{
		System.out.println("saturday");
	}else if(day==7) 
	{
		System.out.println("sunday");
	}else
	{
		System.out.println("wrong day");
	}
	
	}	
}








