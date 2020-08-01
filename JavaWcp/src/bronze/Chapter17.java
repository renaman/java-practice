package bronze;

class Foo1 {
	static int val;
	static int methodA() {
		return ++val;
	}
	int methodB() {
		return methodA();
	}
}
class Chapter17 {
	public static void main(String[] args) {
		Foo1 obj = new Foo1();
		obj.methodA();
		int num = obj.methodB();
		System.out.println(num);
	}
}
