package audio_video_test1;

public class HashCodeGenerator {
	
	private static int counter = 0;
	
	public static int generateHashCode(String name) {
		counter++;
		return name.hashCode() + counter;
	}
}
