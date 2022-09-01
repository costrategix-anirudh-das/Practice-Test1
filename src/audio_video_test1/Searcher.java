package audio_video_test1;

import java.util.HashMap;
import java.util.*;

public class Searcher {
	private static Map<Integer, Song> s1; 
	private static Map<Integer, Video> v1;
	
	public static boolean videoSearch(String name) {
		v1 = VideoCollector.getVideoList();
		//for (Integer key : Sets.union(s1.keySet(), v1.keySet()))
		for(Object key : v1.keySet()) {
			System.out.println(key);
		    Video v = v1.get(key);
		    if (name.equals(v.getVideoName())) {
		    	return true;
		    }
		    else {
		    	continue;
		    }
		}
		return false;	
	}
	
	public static boolean songSearch(String name) {
		s1 = SongCollector.getSongList();
		//for (Integer key : Sets.union(s1.keySet(), v1.keySet()))
		for(Integer key : s1.keySet()) {
			System.out.println(key);
		    Song s = s1.get(key);
		    if (name.equals(s.getSongName())) {
		    	return true;
		    }
		    else {
		    	continue;
		    }
		}
		return false;
	}
	
	public static void search(String name) {
		if (Searcher.songSearch(name) && Searcher.videoSearch(name)) {
			System.out.println("song and video both available");
		}
		else if((Searcher.songSearch(name) == true) && (Searcher.videoSearch(name) == false)) {
				System.out.println("Song exists");
		}
		else if((Searcher.songSearch(name) == false) && (Searcher.videoSearch(name) == true)) {
			System.out.println("Video exists");
		}
		else {
			System.out.println("Nothing exist");
		}
	}
}
