/** 
 * Ian Selby
 * 2/25/2019
 * Description: This program will print payroll in an array for 3 different employee types. Polymorphic methods will be used for earnings and printing records
 */


public class EmployeeDriver {

	public static void main(String[] args) {
	
Employee[] employee = new Employee[7]; // array creation size of 7



// creation of each person and setting their rates, commission , etc..
BasePlusCommission manager1 = new BasePlusCommission("Joe", "Cool", "447-15-7824", 214.00, .05, 400.00);
		
BasePlusCommission manager2 = new BasePlusCommission("Phil", "Lame", "248-32-2476", 336.00, .05, 400.00);
		
CommissionOnly snack1 = new CommissionOnly("Caden", "Deeter", "123-45-6789", 4571.00, 0.08);
		
CommissionOnly snack2 = new CommissionOnly("Zach", "Toland", "987-65-4321", 4782.00, 0.08);
		
CommissionOnly snack3 = new CommissionOnly("Long", "John", "345-54-6464", 2278.00, 0.08);
		
CommissionOnly snack4 = new CommissionOnly("Thomas", "Roland", "245-48-6487", 3654.50, 0.08);
		
PerHour ticket1 = new PerHour("John", "Davis", "478-321-7275", 4.50, 24);

// array values for each employee
employee[0] = manager1;
employee[1] = manager2;
employee[2] = snack1;
employee[3]	= snack2;
employee[4] = snack3;
employee[5] = snack4;
employee[6] = ticket1;	

for (Employee potato : employee) //loop for printing the array out
{
	System.out.println(potato);
}
		
		
	}

}
