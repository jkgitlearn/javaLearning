package javaLearning_if_else;

public class If_Else_Statements {

	public static void main(String[] args) {
	
		String st = " learning statements ";
		int i = 4;
		System.out.println("it will execute because it is before if condition");
		
		if (i>=4)  {	
			i++;
		
			System.out.println("st: " +st);
		
			String str= "this will execute only if condtion is true even though it is inside if condition";
			System.out.println("str : "+str);
		}	
		    System.out.println("it will execute because it is outside if condition");
	}
}

class Ifstatement1 {
	  public static void main(String[] args) {
		
		  int num = 54;
  	  if(num >=50) {
  		  System.out.println("true");
  	  }else {
  		  System.out.println("false");
  	  }
	}	   
}


class Ifstatement2 {
	  public static void main(String[] args) {
		int age=47;
		if (age%10>=8) {
		  System.out.println("correct");
			
		}else 
		{
			System.out.println("false");
		}		    		  
	}
}


class Ifstatement3 {
	  public static void main(String[] args) {
        int z = -25;
        if (z>0) {
          System.out.println("positive");
        }else 
        {
         System.out.println("negative");
        }
	  }
}



