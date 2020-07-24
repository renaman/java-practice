package bronze;

class Test6_7 {
	static String lang = "C";
	public String operation = "Unix";
	Test6_7() {
	}
	Test6_7(String str) {
		operation = str;
	}
	
	public static void main(String args[]) {
		Test6_7 obj1 = new Test6_7();
		Test6_7 obj2 = new Test6_7("Solaris");
		obj2.lang = "Java";
		System.out.println(obj1.lang + "¥t" + obj1.operation);
		System.out.println(obj2.lang + "¥t" + obj2.operation);
	}
}
