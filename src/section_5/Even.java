package section_5;

public class Even {
	
    public static void main(String[] args) {
        for (int i = 1; i <= 10; i++) {
            if (isEven(i))
            	System.out.println(i);
        }
    }
    
    public static boolean isEven(int num) {
        return (num % 2 == 0) ? true : false;
    }

}
