package bronze;

class Test6_3 {
	int x = 50;
	int y = 100;
	public static void main(String[] args) {
		int x = 0, y = 10;
		Test6_3 t = new Test6_3();
		while (x < 3) {
			x++; y--;
		}
		System.out.println("x = " + x + ", y = " + y);
	}
}
