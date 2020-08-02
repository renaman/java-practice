package bronze;

class Foo6 {
	int a;
	Foo6() {
		a = 10;
	}
	Foo6(int a) {
		this.a = a;
	}
}

class Bar4 extends Foo6{
	int b, c;
	Bar4(int a, int b, int c) {
		super(a);
		this.c = c;
	}
}

class Chapter22 {
	public static void main(String[] args) {
		Bar4 bar = new Bar4(100, 200, 300);
		System.out.println("a:" + bar.a + " b:" + bar.b + " c:" + bar.c);
	}
}
