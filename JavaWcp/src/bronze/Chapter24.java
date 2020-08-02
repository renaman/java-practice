package bronze;
class Automobile {
	public void drive() {
		System.out.print("go foward ");
	}
}

class Ferrari extends Automobile {
	public void drive() {
		System.out.print("go fast ");
	}
}

class Chapter24 {
	public static void main(String[] args) {
		Automobile[] autos = {new Automobile(), new Ferrari()};
		for (int x = 0; x < autos.length; x++) {
			autos[x].drive();
		}
	}
}
