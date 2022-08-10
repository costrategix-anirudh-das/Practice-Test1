/*
   Write a method printMegaBytesAndKilBytes that has 1 parameter of type int with the name kiloBytes. 
  This method should not return anything(void) and it needs to calculate the megabytes and remaining kilobytes from the kilobytes parameter.
  Then it needs to print a message in the format "XX KB = YY MB and ZZ KB".  
  XX represents the original value kilobytes 
  YY represents the calculated megabytes 
  ZZ represents the calculated remaining kilobytes
  
  TIPS/NOTES:
      - Use the remainder operator 
      - 1 MB = 1024KB
      - Do not set kilobytes parameter value inside your method
      - The printMegaBytesAndKiloBytes method needs to be defined as public static 
  
  In this code, main method is not included.
 
 */

package section_4;

public class MegaBytes {
	
	public static void printMegaBytesAndKiloBytes(int KiloBytes) {
        if (KiloBytes < 0) {
            System.out.println("Invalid Value");
        }
        else {
            
        int val = 0;
        int rem = 0;
        val = KiloBytes / 1024;
        rem = KiloBytes % 1024;
        System.out.println(KiloBytes + " KB = " + val + " MB and " + rem + " KB");
        
        }
        
	}
	
	public static void main(String[] args) {
		
		printMegaBytesAndKiloBytes(2600);
	}
}
