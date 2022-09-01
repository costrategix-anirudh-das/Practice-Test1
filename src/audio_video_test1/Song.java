package audio_video_test1;

public class Song {
	
	private String songName;
	private int songDuration;
	private String singerName;
	
	public Song(String songName, int duration, String singerName) {
		this.songName = songName;
		this.songDuration = duration;
		this.singerName = singerName;
	}
	
	public String getSongName() {
		return songName;
	}
	public void setSongName(String songName) {
		this.songName = songName;
	}
	public int getDuration() {
		return songDuration;
	}
	public void setDuration(int duration) {
		this.songDuration = duration;
	}
	
	public String getSingerName() {
		return singerName;
	}
	
	public void setSingerName(String singerName) {
		this.singerName = singerName;
	}

}
