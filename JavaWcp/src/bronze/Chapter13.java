package bronze;

class Chapter13 {
	public String method(String x, String y) {
		return x + y;
	}
	
	public float method(float x, float y) {
		return x + y;
	}
}

class Test {
	public static void main(String[] args) {
		Chapter13 c1 = new Chapter13();
		System.out.println(c1.method("10", "20"));
		System.out.println(c1.method(30, 40));
	}
}
