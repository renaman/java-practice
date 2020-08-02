package bronze;


interface I1 {
	void foo();
}
interface I2 {
	void bar();
}

class A3 implements I1 {
	public void foo() {
		System.out.println("foo");
	}
}
class Chapter26 extends A3 implements I2{
	public void bar() {
		System.out.println("bar");
	}
	public static void main(String[] args) {
		A3 a = new Chapter26();
		I2 obj = (I2)a;
		obj.bar();
	}
}
