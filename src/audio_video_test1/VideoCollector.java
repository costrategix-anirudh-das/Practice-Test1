package audio_video_test1;

import java.util.HashMap;
import java.util.Map;

public class VideoCollector {
	
	
	private static Map<Integer, Video> videoList;
	
	public VideoCollector() {
		videoList = new HashMap<>();
	}
	
	public void setvideoList(String name, Video obj) {
		int val = HashCodeGenerator.generateHashCode(name);
		videoList.put(val, obj);
	}
	
	public static Map<Integer, Video> getVideoList() {
		return videoList;
	}
	
	public void printVideoList() {
		
		for(Object key : videoList.keySet()) {
			System.out.println(key);
		    Video v = videoList.get(key);
		    System.out.println(v.getVideoName());
		}
	}
}
