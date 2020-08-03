package bronze;

interface Sample {
	void test();
}

class Aa implements Sample {
	public void test() {
		System.out.println("A ");
	}
}

class Bb extends Aa {
	public void test() {
		System.out.println("B");
	}
}
class Test3 {
	public static void main(String[] args) {
		Sample[] samples = {new Aa(), new Bb()};
		for (Sample s : samples) {;
		s.test();
		}
	}
}
