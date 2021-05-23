public class ObservePatternDemo

{

public static void main(String[] args)

{Publisher p = new Publisher();

//Subscriber1 s1 = new Subscriber1(p);

//Subscriber2 s2 = new Subscriber2(p);

Subscriber3 s3 = new Subscriber3(p);


//p.attach(s1);

//p.attach(s2);

//p.notifyUpdate(new Message("First Message")); //s1 and s2 will receive the update

//p.detach(s1);

//p.attach(s3);

//p.notifyUpdate(new Message("Second Message")); //s2 and s3 will receive the update


System.out.println("First State: ");
p.notifyAllObservers(new Message("State of users changed"));

p.detach(s3);
System.out.println("Second State: ");
p.notifyAllObservers(new Message("State of users 1 and 2 changed"));
}

}