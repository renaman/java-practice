package bronze;

class SubTest7 {
	protected int num;
	public SubTest7() {
		this.num = 1;
	}
	
	public SubTest7(int num) {
		this.num = num;
	}
}

class Test7 extends SubTest7 {
	private int a;
	private int b;
	public Test7(int a) {
		this.a = a;
	}
	
	public Test7(int a, int b) {
		this(a);
		this.b = b;
	}
	
	public static void main(String[] args) {
		Test7 sub = new Test7(2, 3);
		System.out.println(sub.num + ":" + sub.a + ":" + sub.b);
	}
}
