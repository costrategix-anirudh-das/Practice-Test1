package section_4;

public class DecimalComparator {
	
	  public static boolean areEqualByThreeDecimalPlaces (double a, double b) {
		  
		    a = (int) (a * 1000);
		    b = (int) (b * 1000);
		    
		    if (a == b) {
		    
		      return true; 
		      
		    }
		    else {
		    
		      return false;
		    }
		  }
	  
	  public static void main(String[] args) {
		  
		  boolean val = areEqualByThreeDecimalPlaces(3.123, 3.124);
		  if (val == true)
			  System.out.println("Same");
		  else
			  System.out.println("Not Same");
	  }

}
