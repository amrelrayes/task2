import java.util.Scanner;

public class Arethmatic {

	public static void main(String[] args){
		
		Scanner userInput =new Scanner(System.in);
           
           System.out.println("Please Enter the 1st Digit :");
           int firstDigit =userInput.nextInt();
           
           System.out.println("Please Enter the 2nd Digit :");
           int secondDigit =userInput.nextInt();
		
		int addition = firstDigit + secondDigit;
		int subtraction = firstDigit - secondDigit;
		int multiplication = firstDigit * secondDigit;
		int division = firstDigit / secondDigit;
		int moduls = firstDigit % secondDigit;
		
		System.out.println("Addition = "+addition);
		System.out.println("Subtration = "+subtraction);
		System.out.println("multiplication = "+multiplication);
		System.out.println("division = "+division);
		System.out.println("moduls = "+moduls);
	}
}
