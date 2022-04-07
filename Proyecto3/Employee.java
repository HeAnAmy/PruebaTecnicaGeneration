package Proyecto3;

public class Employee extends Person {
	private String departament;
	private double salary;
	public Employee( String name, String email, String rfc, String address, int age, String departament, double salary) {
		super (name, email, rfc, address, age);
		this.departament= departament;
		this.salary= salary;
	}// constructor
	public double calculateSalary() {
		return (this.salary*21)* 1.16;
	}//calculateSalary
	public String printReceipt() {
		return "+ ================================================================================ +"
				+ "| Recibo de "+ getName()+ "\n"
				+ "| Recibo de "+ getDepartament()+ "\n"
				+ "| Recibo de "+ calculateSalary()+ "\n"
				+ "+ ================================================================================ +";
				
	}
	public String getDepartament() {
		return departament;
	}//getDepartament
	public void setDepartament(String departament) {
		this.departament= departament;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary= salary;
	}
	@Override
	public String toString() {
		return "Employee [departament=" + departament + ", salary=" + salary + ", toString()=" + super.toString()
				+ "]";
	}//super toString
	
}
