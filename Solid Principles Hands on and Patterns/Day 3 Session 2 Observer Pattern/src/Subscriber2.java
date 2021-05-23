public class Subscriber2 implements Observer

{
	Publisher publisher;

	public Subscriber2(Publisher publisher) {
		this.publisher = publisher;
		this.publisher.attach(this);
	}
@Override

public void update(Message m) {

System.out.println("MessageSubscriberTwo :: " + m.getMessageContent());

}

}