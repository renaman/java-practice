package bronze;

public class Test6_5 {
	public static void main(String[] args) {
		int num;
		num = 10;
		calc(num);
		System.out.println("num =" + num);
	}
	
	static int calc(int num) {
		return num += 100;
	}
}
