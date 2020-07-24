package bronze;

class Test6_2 {
	public static void main(String[] args) {
		int x = 5;
		Test6_2 t = new Test6_2();
		t.go(x);
		System.out.println(" main:x =" + x);
	}
	void go(int x) {
		System.out.println(" go:x =" + x++);
	}
}
