package audio_video_test1;

import java.util.HashMap;
import java.util.Map;

public class SongCollector {
	
	private static Map<Integer, Song> songList;
	
	public SongCollector() {
		songList = new HashMap<>();
	}

	public static Map<Integer, Song> getSongList() {
		return songList;
	}

	public void setsongList(String name, Song obj) {
		int val = HashCodeGenerator.generateHashCode(name);
		songList.put(val, obj);
		}
	
	public void printSongList() {
		
		//Iterator iterator = songList.keySet().iterator();

		for(Object key : songList.keySet()) {
			System.out.println(key);
		    Song s = songList.get(key);
		    System.out.println(s.getSongName());
		}
	}
	

	
}


