public class DBConnDemo {
   public static void main(String[] args) {

      //illegal construct
      //Compile Time Error: The constructor SingleObject() is not visible
      //SingleObject object = new SingleObject();

      //Get the only object available
	   DBConn object = DBConn.getInstance();
	   System.out.println (object);
      //show the message
      //object.showMessage();
   }
}