import java.util.*;
public class Client {
	public static void main(String args[]) {
	Scanner sc=new Scanner(System.in);
	System.out.println ("Enter the company name");
	String brand=sc.nextLine();
	Factory ob=FactoryGetter.getFactory(brand);
	if (ob!=null) {
		ob.makeTire();
		ob.makeHeadlight();
	}
	else {
		System.out.println("Wrong Choice");
	}
	sc.close();
	}
}
