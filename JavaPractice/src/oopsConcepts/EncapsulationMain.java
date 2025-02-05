package oopsConcepts;

public class EncapsulationMain {

	public static void main(String[] args) {
		
		EncapsulationDemo ed = new EncapsulationDemo();
		/*ed.empid = 50;
		ed.empname = "Ank";
		ed.empcity = "Delhi";
		ed.empSalary = 5000;*/
		
		ed.setempid(89);
		ed.setempname("Ankit");
		ed.setempcity("Delhi");
		ed.setempSalary(500.0);
		
		System.out.println(ed.getempid());
		System.out.println(ed.getempname());
		System.out.println(ed.getempcity());
		System.out.println(ed.getempSalary());

	}	

}
