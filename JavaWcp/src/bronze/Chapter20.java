package bronze;

class Foo4 {
	String str = "Hello";
}

class Bar2 extends Foo4 {
	String str = "Bye";
}

class Chapter20 {
	public static void main(String[] args) {
		Foo4 obj1 = new Foo4();
		Foo4 obj2 = new Bar2();
		System.out.print(obj1.str + " ");
		Bar2 bar = (Bar2)obj2;
		System.out.print(bar.str);
	}
}
