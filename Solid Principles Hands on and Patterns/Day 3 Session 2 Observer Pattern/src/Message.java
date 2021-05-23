public class Message

{
String messageString;
final String messageContent;

public Message (String m)
{ 
	this.messageContent = m; 
	} 
public String getMessageContent() 
{ 
	return messageContent;
	}
public void setMessageString(String messageString) {
	this.messageString = messageString;
}
}