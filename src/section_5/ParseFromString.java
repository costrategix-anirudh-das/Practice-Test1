package section_5;

public class ParseFromString {
	
    public static void main(String[] args) {
	    String numberAsString = "9999.999";
	    String numberAsInt = "999";
	    
        System.out.println("number As String = " + numberAsString);

        double number = Double.parseDouble(numberAsString);
        System.out.println("number = " + number);

        numberAsString += 1;
        number += 1;

        System.out.println("number As String = " + numberAsString);
        System.out.println("number = " + number);
        
        int number2 = Integer.parseInt(numberAsInt);
        System.out.println("Number = " + number2);
    }

}
