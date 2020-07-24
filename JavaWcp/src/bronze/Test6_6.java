package bronze;

class Test6_6 {
	static int num;
	void methodA() {
		num++;
	}
	static void methodB() {
		num++;
	}
	
	public static void main(String[] args) {
		Test6_6 t = new Test6_6();
		t.methodA(); t.methodB();
		System.out.println(num);
	}
}
