package ObserverPattern;

public class Subscriber {
	private String name;
	private Channel channel;
	
	public Subscriber(String name) {
		this.name = name;
	}
	
	public void subscribe(Channel ch) {
		this.channel = ch;
	}
	
	public void update(String title) {
		System.out.println("New Episode for "+title+ " Please check "+name);
	}
}
