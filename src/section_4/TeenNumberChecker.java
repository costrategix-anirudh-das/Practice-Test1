/*
We'll say that a number is "teen" if it is in the range 13 -19 (inclusive).

Write a method named hasTeen with 3 parameters of type int.

The method should return boolean and it needs to return true if one of the parameters is in range 13(inclusive) - 19 (inclusive). Otherwise return false.

Write another method named isTeen with 1 parameter of type int.

The method should return boolean and it needs to return true if the parameter is in range 13(inclusive) - 19 (inclusive). Otherwise return false.

 */

package section_4;

public class TeenNumberChecker {
	
	   public static boolean hasTeen(int a, int b, int c) {
	        
	        if (((a > 12) && (a < 20)) || ((b > 12) && (b < 20)) || ((c > 12) && (c < 20))) {
	            
	            return true;
	        }
	        else {
	            return false;
	        }
	    }
	    
	    public static boolean isTeen(int a) {
	        
	        if ((a > 12) && (a < 20)) {
	            return true;
	        }
	        return false;
	    }
	    
}
