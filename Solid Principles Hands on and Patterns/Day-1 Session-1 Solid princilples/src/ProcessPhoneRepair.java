//package SOLID_Principles.DependencyInjection;

public class ProcessPhoneRepair {
	public void RepairSteps(IPhone iphone) {
		String part1 = iphone.GetPhonePart1();
		System.out.println(String.format("%1$s repaired!", part1));

		double partCost = iphone.GetPart1Cost();
		System.out.println(String.format("Repair Cost %1$s ", partCost * 0.5));
	}

}
