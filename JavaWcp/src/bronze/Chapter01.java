package bronze;

public class Chapter01 {
	public static void main(String[] srgs) {
		char[] array1 = {'H', 'e', 'l', 'l', 'o'};
		char[] array2 = new char[4];
		array2[0] = 'B';
		array2[1] = 'y';
		array2[2] = 'e';
		array1 = array2;
		System.out.println(array1[1]);
	}
}
