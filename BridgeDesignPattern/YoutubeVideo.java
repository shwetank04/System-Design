package BridgeDesignPattern;

public class YoutubeVideo extends Video {

	public YoutubeVideo(VideoProcessor processor) {
		super(processor);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void play(String videoFile) {
		processor.process(videoFile);
		
	}

}
