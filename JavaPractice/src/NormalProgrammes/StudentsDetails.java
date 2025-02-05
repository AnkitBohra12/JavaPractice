package NormalProgrammes;

public class StudentsDetails {
	
	public static void student1() {
		
		int yop = 2020;
		String name = "Ankit";
		float percentage = 69;
		
		System.out.println("The name of student is :"+ name);
		System.out.println("Year of passout : " + yop );
		System.out.println("Percentage obtained : " + percentage);
	}
	
	public static void student2() {
		
		int yop = 2000;
		String name = "Amit";
		float percentage = 99;
		
		System.out.println("The name of student is :"+ name);
		System.out.println("Year of passout : " + yop );
		System.out.println("Percentage obtained : " + percentage);
	}

	public static void main(String[] args) {
		
		System.out.println("Programme Starts from here");
		student1();
		System.out.println();
		student2();
		System.out.println("Programme ends here");
	}
}
