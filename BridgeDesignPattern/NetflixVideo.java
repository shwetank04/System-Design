package BridgeDesignPattern;

public class NetflixVideo extends Video {

	public NetflixVideo(VideoProcessor processor) {
		super(processor);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void play(String videoFile) {
		processor.process(videoFile);

	}

}
