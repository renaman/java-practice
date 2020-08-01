package bronze;

class Super1 {
	static void method() {
		System.out.println("Super");
	}
}

class Sub2 extends Super1 {
	static void method() {
		System.out.println("Sub");
	}
}

class Chapter16 {
	public static void main(String[] args) {
		Super1 obj = new Sub2();
		obj.method();
	}
}
