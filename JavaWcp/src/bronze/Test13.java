package bronze;

public class Test13 {
	public static void main(String[] args) {
        Parent obj = new Child();
        obj.hoge();
        obj.piyo();
    }
}
	class Parent {
		public static void hoge() {
			System.out.println("parent");
	    }

	    public void piyo() {
	        System.out.println("parent");
	    }
	}

	class Child extends Parent {
	    // もちろん@Overrideアノテーションを付けるとコンパイルエラー
	    public static void hoge() {
	        System.out.println("child");
	    }

	    public void piyo() {
	        System.out.println("child");
	    }
	}
