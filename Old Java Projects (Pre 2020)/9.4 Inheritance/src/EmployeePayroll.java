/** 
 * Ian Selby
 * 2/29/2019
 * Description: This program will 
 */


public class EmployeePayroll {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
	//	CommOnly commOnly = new CommOnly("Caden", "Deeter", "123-45-6789", 10000.00, 0.05);
		//CommOnly commOnly1 = new CommOnly("Zach", "Toland", "987-65-4321", 4782.00, 0.07);
		//BasePlusComm BasePlusCommission = new BasePlusComm("Ian", "Devine", "114-78-2364", 6000.00, 0.10, 10.00);
		//Hourly hourly = new Hourly("Joe", "Cool", "447-15-7824", 300.00, 10.10);

		CommOnly employee = new CommOnly("Caden", "Deeter", "123-45-6789", 10000.00, 0.05);
		
		System.out.println("Employee information obtained by get methods: ");
		
		System.out.printf("%s %s%n", "First name is", employee.getfirstName());
		
		System.out.printf("%s %s%n", "Last name is", employee.getlastName());
		
		System.out.printf("%s %s%n", "Social Security Number is", employee.getsocSecNbr());
		
		System.out.printf("%s %s%n", "Gross Sales is", employee.getgrossSales());
		
		System.out.printf("%n");

		
		CommOnly employee2 = new CommOnly("Zach", "Toland", "987-65-4321", 4782.00, 0.07);
		
		
		System.out.printf("%s %s%n", "First name is", employee2.getfirstName());
		
		System.out.printf("%s %s%n", "Last name is", employee2.getlastName());
		
		System.out.printf("%s %s%n", "Social Security Number is", employee2.getsocSecNbr());
		
		System.out.printf("%s %s%n", "Gross Sales is", employee2.getgrossSales());
		
		System.out.printf("%n");
		
BasePlusComm employee3 = new BasePlusComm("Ian", "Devine", "114-78-2364", 6000.00, 0.10, 10.00);
		
		
		System.out.printf("%s %s%n", "First name is", employee3.getfirstName());
		
		System.out.printf("%s %s%n", "Last name is", employee3.getlastName());
		
		System.out.printf("%s %s%n", "Social Security Number is", employee3.getsocSecNbr());
		
		System.out.printf("%s %s%n", "Gross Sales is", employee3.getgrossSales());
		
		System.out.printf("%n");

		
BasePlusComm employee1 = new BasePlusComm("Joe", "Cool", "447-15-7824", 300.00, 10.10, 0);
		
		
		System.out.printf("%s %s%n", "First name is", employee1.getfirstName());
		
		System.out.printf("%s %s%n", "Last name is", employee1.getlastName());
		
		System.out.printf("%s %s%n", "Social Security Number is", employee1.getsocSecNbr());
		
		System.out.printf("%s %s%n", "Gross Sales is", employee1.getgrossSales());
		
		System.out.printf("%n");
		
	}

}
