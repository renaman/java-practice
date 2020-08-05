package bronze;
 class Super10 {
	 public Super10() {
		 System.out.println("Super()");
	 }
	 
	 public Super10(int a) {
		 System.out.println("Super(int a)");
	 }
 }
 
 class Sub1 extends Super10 {
	 public Sub1() {
		 System.out.println("Sub()");
	 }
	 
	 public Sub1(int a) {
		 super(a);
		 System.out.println("Sub(int a)");
	 }
 }
public class Test10 {
	public static void main(String[] args) {
		Sub1 sub = new Sub1();
		Sub1 sub1 = new Sub1(10);
	}
}
