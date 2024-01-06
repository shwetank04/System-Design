package ObserverPattern;

import java.util.ArrayList;
import java.util.List;

public class Channel {
private String title;
private List<Subscriber> subs = new ArrayList();

public void subscriber(Subscriber s) {
	subs.add(s);
}

public void unSubscribe(Subscriber s) {
	subs.remove(s);
}

public void upload(String title) {
	this.title = title;
	NotifySubscriber(title);
}

private void NotifySubscriber(String title) {
for(Subscriber s : subs) {
	s.update(title);
}
}
}
