/*
Write a method named getEvenDigitSum with one parameter of type int called number. 

The method should return the sum of the even digits within the number. 

If the number is negative, the method should return -1 to indicate an invalid value.

NOTE: The method getEvenDigitSum ​should be defined as public static like we have been doing so far in the course.

NOTE: Do not add a main method to the solution code.

 */

package section_5;

public class EvenDigitSum {
	
	  public static  int getEvenDigitSum(int number) {
	        int copy = number;
	        int sum = 0;
	        int isEven = 0;
	        if (number < 0)
	            return -1;
	        while (copy != 0) {
	            
	            isEven = copy % 10;
	            if (isEven % 2 == 0)
	                sum += isEven;
	            copy /= 10;
	        }
	        return sum;
	    }

}
