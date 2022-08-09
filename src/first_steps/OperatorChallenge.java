// Create a double variable with a value of 20.00
// Create a second variable of type double with the value 80.00
// Add both numbers together and multiply by 100.00
// Use the remainder operator to figure out what the remainder from the result of the operation in step 3 and 40.00
// Create a boolean variable that assigns the value true if the remainder is #4 is 0, or false if its not zero
// Output the boolean variable
// write an if-then statement that displays a message "Got Some remainder" if the boolean in step 5 is not true


package first_steps;

public class OperatorChallenge {
	
	public static void main(String[] args) {
		double val1 = 20.00d;
        double val2 = 80.00d;
        double total = (val1 + val2) * 100.00d;
        System.out.println("Total = " + total);
        double rem = total % 40.00d;
        System.out.println("Remainder = " + rem);
        boolean noRem = (rem == 0) ? true : false;
        System.out.println("is No Remainder = " + noRem);
        if (!noRem) {
            System.out.println("Got some remainder");
        }
	}

}
