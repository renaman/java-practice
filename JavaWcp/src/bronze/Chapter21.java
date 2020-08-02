package bronze;


class Foo5 {
	String str = "Hello";
}

class Bar3 extends Foo5 {
	String str = "Bye";
}

class Chapter21 {
	public static void main(String[] args) {
		Foo5 obj1 = null;
		Bar3 obj2 = null;
		System.out.print(obj1 + " ");
		System.out.print(obj2);
	}
}
