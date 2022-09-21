package javaLearning_if_else;

import java.util.Scanner;
public class Switch_Case_Statements_30_4 {         // using scanner switch case

	public static void main(String[] args) {   /*Write a Java program that keeps a number from the user and 
                                                generates an integer between 1 and 7 and displays the name of the weekday.*/
		  int day;
		     Scanner s= new Scanner(System.in);
		     System.out.println("enter the day number");
		     day =s.nextInt();
		     
		     switch(day) 
		     {
		     case 1:
		    	 System.out.println("monday");
		    	 break;
		     case 2:
		    	 System.out.println("tuesday");
		    	 break;
		     case 3:
		    	 System.out.println("wednesday");
		    	 break;
		     case 4 :
		    	 System.out.println("thursday");
		    	 break;
		     case 5:
		    	 System.out.println("friday");
		    	 break;
		     case 6 :	
		    	 System.out.println("saturday");
		    	 break;
		     case 7:
		    	 System.out.println("sunday");
		    	 break;
		    default:
		    	System.out.println("not a day or invalid day");
		     }     
	}
}


class Switch_30_4 {

	public static void main(String[] args) {
		
		int day =2;                          //int,short,char mostly used for switch
		
		switch(day) {   
		case 1:
			System.out.println("Monday");
			break;
		case 2:
			System.out.println("Tuesday");
			break;
		case 3:
			System.out.println("Wednesday");
			break;
		case 4:
			System.out.println("Thursday");
			break;
		case 5:
			System.out.println("Friday");
			break;	
		case 6:
			System.out.println("Saturday");
			break;
		case 7:
			System.out.println("Sunday");
			break;	
		default:                               // default should be written before closing the switch/or at the end of all the cases done
			System.out.println("invalid days");// its used only none of the above cases are matched
		}

	}

}

class Switch_1_30_4 {
	public static void main(String[] args) {
		
		char grade ='E';
		
		switch(grade) {
		case 'A':
		//grade='A';
			System.out.println("grade is A: Excellent");
			break;
		case 'B':
		//grade='B';	
			System.out.println("grade is B:good");
			break;	
		case 'C':
		//grade='C';	
				System.out.println("grade is C: fair");
				break;
		case 'D':		
		//grade='D';	
				System.out.println("grade is D: fail");
				break;			
		default:
			System.out.println("Invalid Grade");
		}
		
	}
	
}

