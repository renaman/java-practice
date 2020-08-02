package bronze;

interface I {
	void func();
}

class A1 implements I {
	public void func() {
		System.out.println("A ");
	}
}

class B1 extends A1 {
	public void func() {
		System.out.println("B ");
	}
	
	public void method() {
		System.out.println("C ");
	}
}

class Chapter23 {
	public static void main(String[] args) {
		I obj;
		A1 a = new A1();
		B1 b = new B1();
		obj = b;
		obj.func();
		b.method();
	}
}
