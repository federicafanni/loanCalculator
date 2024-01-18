import java.util.Scanner;//Importing the Scanner class so as to be able to take the input from the user.

public class loanCalculator {
	public static void main(String[] args) {//This is the main method to launch execution.
		Scanner myScanner = new Scanner(System.in);// Creating a Scanner object for the user input.
		
		System.out.print("Input loan amount: "); //This asks the user to provide the amount to borrow. 
		double inputLoan = myScanner.nextDouble();/*This code takes the loan input from the user and interprets it as a double type.
													so as to accept floating numbers within a vast range.*/
		
		System.out.print("Input interest rate (%): "); //This asks the user to provide the interest rate. 
		double inputInterestRate = myScanner.nextDouble();//This code takes the interest input from the user and interprets it as a double type.
		
		
		System.out.print("Input years of loan payment: "); //This asks the user to provide the years to pay back the loan. 
		double inputYears = myScanner.nextDouble();//This code takes the years input from the user and interprets it as a double type.
		
		myScanner.close();//Telling the Scanner not to wait for user input anymore.
		
		double rateDecimalNumber = inputInterestRate / 100.0; //Calculating the total amount to repay
		double amountToPayBack = (inputLoan * rateDecimalNumber * inputYears) + inputLoan;

		System.out.print("Total amount to be repaid: " + amountToPayBack); //Printing the total loan amount to be paid back.
	}

}






		 