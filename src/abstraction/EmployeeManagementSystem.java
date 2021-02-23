package abstraction;

public abstract class EmployeeManagementSystem {
	
	public abstract void createEmployee ();
	
	public void commonEmpBenefits() {
		System.out.println("Common Benefits for employees");
	}
	
	public abstract void updateEmployee ();
	
	public abstract void removeEmployee ();
	
	public abstract void getEmployeeByID ();
	
	public abstract void calculateEmployeeSalary ();
		


}
