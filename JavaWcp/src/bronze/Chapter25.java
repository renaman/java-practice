package bronze;

interface Book {
	void getName();
}

class Java implements Book {
	public void getName() {
		System.out.print("Java ");
	}
}

class Linux implements Book {
	public void getName() {
		System.out.print("Linux ");
	}
}

class Chapter25 { 
	public static void main(String[] args) {
		Book[] books = {new Java(), new Linux()};
		for (int x = 0; x < books.length; x++) {
			books[x].getName();
		}
	}
}
