package bronze;

class Super12 {
	void method() {
		System.out.println("Super12");
	}
}

class Sub12 extends Super12 {
	void method() {
		System.out.println("Sub12");
	}
}
class Test12 {
	public static void main(String[] args) {
		Super12 obj = new Sub12();
		obj.method();
	}
}
