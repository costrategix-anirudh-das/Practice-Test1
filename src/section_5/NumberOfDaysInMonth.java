/*
Write a method isLeapYear with a parameter of type int named year. 

The parameter needs to be greater than or equal to 1 and less than or equal to 9999.

If the parameter is not in that range return false. 

Otherwise, if it is in the valid range, calculate if the year is a leap year and return true if it is, otherwise return false. 

A year is a leap year if it is divisible by 4 but not by 100, or it is divisible by 400.

Examples of input/output:

isLeapYear(-1600); →  should return false since the parameter is not in the range (1-9999)

isLeapYear(1600); → should return true since 1600 is a leap year

isLeapYear(2017); → should return false since 2017 is not a leap year

isLeapYear(2000); → should return true because 2000 is a leap year 

​NOTE:  The solution to the Leap Year coding exercise earlier in the course created the isLeapYear method. You can use that solution if you wish.

Write another method getDaysInMonth with two parameters month and year.  ​Both of type int.

If parameter month is < 1 or > 12 return -1. ​

If parameter year is < 1 or > 9999 then return -1.

This method needs to return the number of days in the month. Be careful about leap years they have 29 days in month 2 (February).

You should check if the year is a leap year using the method isLeapYear described above.

Write a method isLeapYear with a parameter of type int named year. 

The parameter needs to be greater than or equal to 1 and less than or equal to 9999.

If the parameter is not in that range return false. 

Otherwise, if it is in the valid range, calculate if the year is a leap year and return true if it is, otherwise return false. 

A year is a leap year if it is divisible by 4 but not by 100, or it is divisible by 400.

Examples of input/output:

isLeapYear(-1600); →  should return false since the parameter is not in the range (1-9999)

isLeapYear(1600); → should return true since 1600 is a leap year

isLeapYear(2017); → should return false since 2017 is not a leap year

isLeapYear(2000); → should return true because 2000 is a leap year 

​NOTE:  The solution to the Leap Year coding exercise earlier in the course created the isLeapYear method. You can use that solution if you wish.

Write another method getDaysInMonth with two parameters month and year.  ​Both of type int.

If parameter month is < 1 or > 12 return -1. ​

If parameter year is < 1 or > 9999 then return -1.

This method needs to return the number of days in the month. Be careful about leap years they have 29 days in month 2 (February).

You should check if the year is a leap year using the method isLeapYear described above.

 */

package section_5;

public class NumberOfDaysInMonth {
	
    public static boolean isLeapYear(int year) {
    	
		return (year > 1 && year < 9999) ? ((year % 4 == 0 && year % 100 != 0) || (year % 100 == 0 && year % 400 == 0)) : false;
	}
    
    public static int getDaysInMonth(int month, int year) {
        
        if ((month < 1) || (month > 12) || (year < 1) || (year > 9999)) {
            return -1;
        }
        else {
            
            switch (month) {
                
                case 1:
                    return 31;
                  //  System.out.println("31");
                   // break;
                    
                case 2:
                    if ((month == 2) && isLeapYear(year)) {
                        return 29;
                    //System.out.println("29");
                    }
                    else {
                        return 28;
                        //System.out.println("28");
                    }
                   // break;
                    
                case 3:
                    return 31;
                    //System.out.println("31");
                   // break;
                    
                case 4:
                    return 30;
                    //System.out.println("30");
                    //break;
                    
                case 5:
                    return 31;
                    //System.out.println("31");
                    //break;
                    
                case 6:
                    return 30;
                    //System.out.println("30");
                    //break;
                    
                case 7:
                    return 31;
                    //System.out.println("31");
                    //break;
                    
                case 8:
                    return 31;
                    //System.out.println("31");
                    //break;
                    
                case 9:
                    return 30;
                    //System.out.println("30");
                   // break;
                    
                case 10:
                    return 31;
                    //System.out.println("31");
                    //break;
                    
                case 11:
                    return 30;
                   // System.out.println("30");
                   // break;
                    
                case 12:
                    return 31;
                   // System.out.println("31");
                    //break;

            }
            return 0;
            
        }
        
    }

}
