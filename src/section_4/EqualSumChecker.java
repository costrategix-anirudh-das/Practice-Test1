/*
Write a method hasEqualSum with 3 parameters of type int.

The method should return boolean and it needs to return true if the sum of the first and second parameter is equal to the third parameter. Otherwise, return false.

NOTE: The hasEqualSum method  needs to be defined as public static ​like we have been doing so far in the course.
NOTE: Do not add a  main method to solution code.

 */

package section_4;

public class EqualSumChecker {

	   public static boolean hasEqualSum(int a, int b,int c) {
	        
	        if (a + b == c) 
	            return true;
	        else
	            return false;
	    }
}
