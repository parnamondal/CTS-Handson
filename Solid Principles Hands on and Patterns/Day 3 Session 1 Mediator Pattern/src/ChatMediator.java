import java.util.ArrayList;
import java.util.List;
public class ChatMediator implements IChatMediator {
List <IUser> users=new ArrayList<IUser>();
@Override
public void AddUser(IUser user) {
	users.add(user);
}
@Override
public void sendMessage(String message,IUser sender) {
	for (IUser itr:users) {
		if (itr!=sender) {
itr.receiveMessage(message);}
	}
}
}
