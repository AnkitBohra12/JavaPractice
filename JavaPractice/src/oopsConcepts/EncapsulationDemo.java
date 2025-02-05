// wrapping up of data and methods in single unit is called encapsulation(class)
// used for security purpose 
/*
 * # Three rules of encapsulation
 * 1) all variables should be private
 * 2) for every variable there should be 2 methods(set and get)
 * 3) variables can be operated only through methods 
 * */

package oopsConcepts;

public class EncapsulationDemo {
	
	private int empid;
	private String empname;
	private String empcity;
	private double empSalary;
	
	void setempid(int empid) {
		this.empid = empid;
	}
	
	int getempid() {
		return empid;
	}
	
	void setempname(String empname) {
		this.empname = empname;
	}
	
	String getempname() {
		return empname;
	}
	
	void setempcity(String empcity) {
		this.empcity = empcity;
	}
	
	String getempcity() {
		return empcity;
	}
	
	void setempSalary(double empSalary) {
		this.empSalary = empSalary;
	}
	
	double getempSalary() {
		return empSalary;
	}
						
}
