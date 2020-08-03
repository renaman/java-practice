package bronze;

public class Test5 {
	private String size;
	private String title;
	
	Test5() {
		this("refresh");
		this.size = "L";
	}
	
	Test5(String title) {
		this.title = title;
	}
	
	void printInfo() {
		System.out.println(title + " " + size);
	}
	
	public static void main(String[] args) {
		Test5 t = new Test5();
		t.printInfo();
	}
	
}
