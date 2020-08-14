package bronze;

public class Test20 {
	public static void main(String[] args) {
		double fuelCost = 12.5;
		double fuelAmount = 55.0;
		
		Car car = new Car(fuelCost, fuelAmount);
		car.move(20);
		System.out.println("残量は、" + car.getFuelAmount() + "です");
	}
}

class Car {
	private double fuelCost;
	private double fuelAmount;
	
	Car(double fuelCost, double fuelAmount) {
		this.fuelCost = fuelCost;
		this.fuelAmount = fuelAmount;
	}
	
	public void move(int km) {
		System.out.println(km + " 走ります");
		this.fuelAmount -= (km / fuelCost);
	}
	
	public double getFuelAmount() {
		return this.fuelAmount;
	}
}
