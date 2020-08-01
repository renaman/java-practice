package bronze;


class Foo3 {
	public int num;
	int methodA() {
		return num;
	}
	
	public int methodB() {
		return num;
	}
}
class Chapter19 {
	public static void main(String[] args) {
		Foo3 foo = new Foo3();
		foo.methodA();
		foo.methodB();
		System.out.println(foo.num);
	}
}
