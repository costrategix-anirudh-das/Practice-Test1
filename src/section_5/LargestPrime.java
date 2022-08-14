/*

Write a method named getLargestPrime with one parameter of type int named number. 

If the number is negative or does not have any prime numbers, the method should return -1 to indicate an invalid value.

The method should calculate the largest prime factor of a given number and return it.

HINT: Since the numbers 0 and 1 are not considered prime numbers, they cannot contain prime numbers.

NOTE: The method getLargestPrime ​should be defined as public static like we have been doing so far in the course.

NOTE: Do not add a main method to the solution code.
 */

package section_5;

public class LargestPrime {
	
    public static int getLargestPrime(int number) {
        
        if (number <= 0 || number <= 1) {
            return -1;
        }
         else {
            int largestPrime = 2;
            while (largestPrime < number) {
                if (number % largestPrime != 0) {
                    largestPrime++;
                } else {
                    number = number / largestPrime;
                    
                }
            }
            return number;
        }
    }

}
