
public class MediatorDemo {
public static void main (String args[]) {
	ChatMediator chatmediator=new ChatMediator();
	IUser basicuser=new BasicUser(chatmediator,"basic");
	IUser premiumuser=new PremiumUser(chatmediator,"premium");
	chatmediator.AddUser(premiumuser);
	chatmediator.AddUser(basicuser);
	chatmediator.AddUser(new BasicUser(chatmediator, "Mr.X"));
	chatmediator.AddUser(new PremiumUser(chatmediator, "Mr.Y"));
	
	premiumuser.sendMessage("Hi there");
}
}
