package bronze;

public class Chapter11 {
	public static void main(String[] args ) {
		char[] array = {'a', 'b', 'c'};
		for (int i = 0; i < array.length; i++) {
			System.out.println(i + " ");
			switch (array[i]) {
			case 'a':
				System.out.print("a ");
			case 'b':
				System.out.print("b ");
			case 'c':
				System.out.print("c ");
			}
		}
	}
}
