package Static;

public class StaticMain {

	public static void main(String[] args) {
		StaticDemo sd = new StaticDemo();
		sd.s2();
		sd.s3();
		
		System.out.println(StaticDemo.x);
		StaticDemo.s1();
	}

}
