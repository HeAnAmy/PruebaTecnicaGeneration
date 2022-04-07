package Proyecto3;

public class Nomina {

		public static void calculate(Pagable e) {
//			System.out.println(e.printReceipt());
			System.out.println(
					"+=================================+\n"
					+ "|Recibo de "+ e.getName() +"\n"  

					+ "|Departamento "+ e.getDepartment() + "\n"

					+ "|Total =" + e.calculateSalary() + "\n"
					+ "+================================+"	
							
							
					);
		}//calculate
		
		
		

}
