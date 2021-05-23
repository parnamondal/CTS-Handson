public class DBConn {

   //create an object of SingleObject
   private static DBConn instance = new DBConn();

   //make the constructor private so that this class cannot be
   //instantiated
   private DBConn(){}

   //Get the only object available
   public static DBConn getInstance(){
      return instance;
   }

   //public void showMessage(){
	   
      //System.out.println("Hello World!");
   //}
}
