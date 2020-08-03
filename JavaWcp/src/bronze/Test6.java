package bronze;

class Test6 {
	protected int num;
	public Test6() {
		this.num = 1;
	}
	
	public Test6(int num) {
		this.num = num;
	}
}

class SubClass extends Test6 {
	private int a;
	private int b;
	public SubClass(int a) {
		this.a = a;
	}
	public SubClass(int a, int b) {
		this(a);
		this.b = b;
	}
	
	public static void main(String[] args) {
		SubClass sub = new SubClass(2, 3);
		System.out.println(sub.num + ":" + sub.a + ":" + sub.b);
	}
	
}
