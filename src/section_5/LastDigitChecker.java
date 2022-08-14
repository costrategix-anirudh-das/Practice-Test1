/*
Write a method named hasSameLastDigit with three parameters of type int. 

Each number should be within the range of 10 (inclusive) - 1000 (inclusive). If one of the numbers is not within the range, the method should return false.

The method should return true if at least two of the numbers share the same rightmost digit; otherwise, it should return false.

Write another method named isValid with one parameter of type int.

The method needs to return true if the number parameter is in range of 10(inclusive) - 1000(inclusive), otherwise return false.

NOTE: All methods need to be defined as public static as we have been doing so far in the course.

NOTE: Do not add a main method to the solution code.

 */

package section_5;

public class LastDigitChecker {
	
	  public static boolean hasSameLastDigit(int fDigit, int sDigit, int lDigit) {
		  
		    if(isValid(fDigit) && isValid(sDigit) && isValid(lDigit)) {
		    
		      if((fDigit % 10 == sDigit % 10) || (fDigit % 10 == lDigit % 10) || (sDigit % 10 == lDigit % 10)) {
		      
		        return true;
		      
		      }
		    
		    }
		    return false;
		  
		  }
	  
	  public static boolean isValid(int number) {
		  
		   return(number >= 10 && number <= 1000);
		  
		  }

}
