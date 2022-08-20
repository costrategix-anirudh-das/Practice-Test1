


package exercise_43;
import java.util.*;
public class ReverseArray {
	
	 public static void main(String[] args) {

	        int[] array = {1, 5, 3, 7, 11, 9, 15};
	        reverse(array);
	}
	 
    private static void reverse(int[] arr) {
        int max = arr.length - 1;
        int half = arr.length / 2;

        System.out.println("Array = " + Arrays.toString(arr));
            
        for (int i = 0; i < half; i++) {
            int temp = arr[i];
            arr[i] = arr[max - i];
            arr[max - i] = temp;
        }
        
        System.out.println("Reversed Array = " + Arrays.toString(arr));
    }
}