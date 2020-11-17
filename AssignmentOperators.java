import java.util.Scanner;

public class AssignmentOperators {
	
	public static void main(String[] args){
		
	Scanner userInput =new Scanner(System.in);
		           
	System.out.println("Please Enter the 1st Number :");
	  int numberOne =userInput.nextInt();
		           
	System.out.println("Please Enter the 2nd Number :");
	  int numberTwo =userInput.nextInt();
	  
	  numberOne+=numberTwo;
	  System.out.println(numberOne);
	  
	  numberOne-=numberTwo;
	  System.out.println(numberOne);
	  			
	  numberOne*=numberTwo;
	  System.out.println(numberOne);
	  
	  numberOne/=numberTwo;
	  System.out.println(numberOne);
	  
	  numberOne%=numberTwo;
	  System.out.println(numberOne);
	}
}
