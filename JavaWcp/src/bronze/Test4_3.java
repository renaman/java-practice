package bronze;

public class Test4_3 {
	public static void main(String[] args) {
		int x = 0;
		int y = 10;
		do {
			y--;
			++x;
		} while (x < 5);
		System.out.println(x + "," + y);
	}
	
}
