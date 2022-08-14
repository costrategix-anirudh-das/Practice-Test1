/*
Write a method named hasSharedDigit with two parameters of type int. 

Each number should be within the range of 10 (inclusive) - 99 (inclusive). If one of the numbers is not within the range, the method should return false.

The method should return true if there is a digit that appears in both numbers, such as 2 in 12 and 23; otherwise, the method should return false.

NOTE: The method hasSharedDigit​ should be defined as public static like we have been doing so far in the course.

NOTE: Do not add a main method to the solution code.

 */

package section_5;

public class SharedDigit {
	
	 public static boolean hasSharedDigit(int fNumber, int sNumber) {
		  
		    if((fNumber >= 10) && (fNumber <= 99) && (sNumber >= 10) && (sNumber <= 99)) {
		    
		        if ((fNumber == sNumber) || (fNumber / 10 == sNumber / 10) || (fNumber % 10 == sNumber / 10) || (fNumber % 10 == sNumber % 10)) 
		            return true;
		    } 
		    else
		        return false;
		    
		    return false;
		  
		  }

}
