package ObserverPattern;

public class Main {

	public static void main(String[] args) {
		Subscriber s = new Subscriber("Shwetank");
		Channel c = new Channel();
		c.subscriber(s);
		s.subscribe(c);
		c.upload("Jujutsu");
	}

}
