package audio_video_test1;

public class Video {
	
	private String videoName;
	private int videoDuration;
	private String singerVideoName;
	
	public Video(String videoName, int videoDuration, String singerVideoName) {
		this.videoName = videoName;
		this.videoDuration = videoDuration;
		this.singerVideoName = singerVideoName;
	}

	public String getVideoName() {
		return videoName;
	}

	public void setVideoName(String videoName) {
		this.videoName = videoName;
	}

	public int getVideoDuration() {
		return videoDuration;
	}

	public void setVideoDuration(int videoDuration) {
		this.videoDuration = videoDuration;
	}

	public String getSingerVideoName() {
		return singerVideoName;
	}

	public void setSingerVideoName(String singerVideoName) {
		this.singerVideoName = singerVideoName;
	}
	
	
	
}
