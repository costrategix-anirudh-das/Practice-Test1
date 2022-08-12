/*

Write a method printEqual with 3 parameters of type int. The method should not return anything (void).

If one of the parameters is less than 0, print text "Invalid Value".

If all numbers are equal print text "All numbers are equal"

If all numbers are different print text "All numbers are different".

Otherwise, print "Neither all are equal or different"

NOTES

The solution will not be accepted if there are extra spaces.

The method printEqual needs to be defined as public static ​like we have been doing so far in the course.

Do not add main method to solution code.
 */

package section_4;

public class EqualityPrinter {

	public static void printEqual(int fNumber, int sNumber, int tNumber) {
		  
	    if ((fNumber < 0) || (sNumber < 0) || (tNumber < 0)) {
	    
	      System.out.println("Invalid Value");
	    
	    }
	    else if ((fNumber == sNumber) && (fNumber == tNumber) && (sNumber == tNumber)) {
	    
	      System.out.println("All numbers are equal");
	    
	    }
	    else if ((fNumber != sNumber) && (fNumber != tNumber) && (sNumber != tNumber)) {
	    
	      System.out.println("All numbers are different");
	    
	    }
	    else {
	    
	      System.out.println("Neither all are equal or different");
	    
	    }
	  
	  }
}
