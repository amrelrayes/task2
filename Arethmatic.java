import java.util.Scanner;

public class Arethmatic {

	public static void main(String[] args){
		
		int firstDigit = 0 ;
		int secondDigit = 0 ; 
		
		   Scanner userInput =new Scanner(System.in);
           
           System.out.println("Please Enter the 1st Digit :");
           int firstDigit1 =userInput.nextInt();
           
           System.out.println("Please Enter the 2nd Digit :");
           int secondDigit1 =userInput.nextInt();
		
		int addition = firstDigit1 + secondDigit1;
		int subtraction = firstDigit1 - secondDigit1;
		int multiplication = firstDigit1 * secondDigit1;
		int division = firstDigit1 / secondDigit1;
		int moduls = firstDigit1 % secondDigit1;
		
		System.out.println("Addition = "+addition);
		System.out.println("Subtration = "+subtraction);
		System.out.println("multiplication = "+multiplication);
		System.out.println("division = "+division);
		System.out.println("moduls = "+moduls);
	}
}
