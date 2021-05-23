import java.util.Scanner;

public class Main {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Welcome to our site.Would you like to order or repair?");
		String processOption = sc.nextLine().toLowerCase().trim();

		PhoneOrderRepair0 phoneorderrepair0 = new PhoneOrderRepair0();
		PhoneOrderRepair phoneorderrepair = new PhoneOrderRepair();

		String productDetail = "";
		switch (processOption) {
		case "order":
			System.out.println("Please provide your phone model name");
			productDetail = sc.nextLine().trim();
			phoneorderrepair0.ProcessOrder(productDetail);
			break;
		case "repair":
			System.out.println("Is it the phone or the accessory that you want to be repaired");
			String productType = sc.nextLine().toLowerCase();
			if (productType.equals("phone")) {
				System.out.println("Please provide your phone model name");
				productDetail = sc.nextLine().trim();
				phoneorderrepair.ProcessPhoneRepair(productDetail);
			} else {
				System.out.println("Please provide the accessory detail,like headphone , tempered glass");
				productDetail = sc.nextLine().trim();
				phoneorderrepair.ProcessAccessoryRepair(productDetail);
			}
			break;
		default:
			break;

		}
		sc.close();
	}
}
