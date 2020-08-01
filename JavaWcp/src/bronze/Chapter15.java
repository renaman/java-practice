package bronze;


class Super {
	void method() {
		System.out.println("Super");
	}
}

class Sub extends Super {
	void method() {
		System.out.println("Sub");
	}
}
class Chapter15 {
	public static void main(String[] args) {
		Super obj = new Sub();
		obj.method();
	}
}
