package bronze;

class Foo2 {
	public void method() {
		System.out.println("Hello");
	}
}

class Bar extends Foo2 {
	public void method() {
		System.out.println("Bye");
	}
}
class Chapter18 {
	public static void main(String[] args) {
		Foo2 foo = new Bar();
		Bar bar = (Bar)foo;
		bar.method();
	}
}
