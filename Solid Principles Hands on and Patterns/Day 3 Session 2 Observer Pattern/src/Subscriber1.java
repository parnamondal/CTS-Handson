public class Subscriber1 implements Observer

{
	Publisher publisher;

	public Subscriber1(Publisher publisher) {
		this.publisher = publisher;
		this.publisher.attach(this);
	}
@Override

public void update(Message m) {

System.out.println("MessageSubscriberOne :: " + m.getMessageContent());

}

}