package bronze;

class Foo {
	public String method(String x, String y) {
		return x + y;
	}
	
	public float method(float x, float y) {
		return x + y;
	}
}

class Chapter12 {
	public static void main(String[] args) {
		Foo foo = new Foo();
		System.out.println(foo.method("10", "20"));
		System.out.println(foo.method(30, 40));
	}
}
