package bronze;

public class Test19 {
	public static void main(String[] args) {
		int i = 1;
		while (i < 5) {
			System.out.println(i * i);
			i++;
		}
		
		int[] s = {1, 2, 3, 4};
		for (int x = 0; x < s.length; x++) {
			System.out.println(s[x]);
		}
		
		for (int z : s) {
			if (z % 2 == 0) {
				continue;
			} else {
				System.out.println(z);
			}
		}
	}
}
