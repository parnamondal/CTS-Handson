// package SOLID_Principles ;

public class PhoneOrderRepair implements IOrderRepair {
	public void ProcessAccessoryRepair(String accessoryType) {
		System.out.println(String.format("%1$s repair accepted!", accessoryType));

	}

	public void ProcessPhoneRepair(String modelName) {
		System.out.println(String.format("%1$s repair accepted!", modelName));

	}
}
