public class MovableAdapterImp implements MovableAdapter {
	private Movable luxuryCars;

	public MovableAdapterImp(Movable bugattiVeyron) {
		luxuryCars=bugattiVeyron;
	}

	// standard constructors
	@Override
	public double getSpeed() {
		return convertMPHtoKMPH(luxuryCars.getSpeed());
	}

	private double convertMPHtoKMPH(double mph) {
		return mph * 1.60934;
	}

	@Override
	public double getPrice() {
		return convertUSDtoEUR(luxuryCars.getPrice());
	}
	
	private double convertUSDtoEUR(double usd) {
		return usd * 0.84;
	}
}