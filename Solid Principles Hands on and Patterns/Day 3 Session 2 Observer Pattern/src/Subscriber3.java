public class Subscriber3 implements Observer

{
	Publisher publisher;

	public Subscriber3(Publisher publisher) {
		this.publisher = publisher;
		this.publisher.attach(this);
	}

@Override

public void update(Message m) {

System.out.println("MessageSubscriberThree :: " + m.getMessageContent());

}

}