package Static;

public class StaticDemo {

	
		
		static int x = 90;
		int y = 80;
		
		static void s1() {
			System.out.println("This is a s1 static Method..");
		}
		
		void s2() {
			System.out.println("This is s2 static method");
			// 3. non static methods can access everything directly
		}
		
		void s3() {
			System.out.println(x);
			System.out.println(y);
			s1();
		}
		public static void main(String[] args) {
		
		//1. Static methods can access static stuff directly(without object
			System.out.println(x);
			s1();
			
		//2. static methods can use non static methods through object
			StaticDemo sd = new StaticDemo();
			System.out.println(sd.y);
			sd.s2();
			
			
		}

}

