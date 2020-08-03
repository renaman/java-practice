package bronze;

public class Test2 {
	static String name;
	
	public Test2() {
		this("none");
	}
	public Test2(String name) {
		this.name = name;
	}
	
	public static void main(String[] args) {
		Test2 t1 = new Test2();
		Test2 t2 = new Test2("aline");
		System.out.print(t1.name + " " + t2.name);
	}
}
