package bronze;


class Dog {
	private String name;
	private String breed;
	
	Dog(String name, String breed) {
		this.name = name;
		this.breed = breed;
	}
	public void printData() {
		System.out.println(this.name);
		System.out.println(this.breed);
	}
}
class Cat extends Dog {
	Cat(String name, String breed) {
		super(name, breed);
	}
}
class Test14 {
	public static void main(String[] args) {
		Cat cat = new Cat("くるぶし", "ミヌエット");
		cat.printData();
	}
}
