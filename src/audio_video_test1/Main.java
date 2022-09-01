package audio_video_test1;
import java.util.*;

public class Main {
	
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		Song s1 = new Song("perfect", 190, "ed sheeran");
		SongCollector sc1 = new SongCollector();
		sc1.setsongList("perfect", s1);
		
		Video v1 = new Video("perfect", 190, "ed sheeran");
		VideoCollector vc1 = new VideoCollector();
		vc1.setvideoList("perfect", v1);
		
		s1 = new Song("lonely", 210, "justin");
		sc1.setsongList("lonely", s1);
		sc1.printSongList();
		
		Searcher.search("perfect");
	}

}
