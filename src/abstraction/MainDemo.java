package abstraction;

public class MainDemo {

	public static void main(String[] args) {
		System.out.println("Accessing the Simplilearn EMP");
		EmployeeManagementSystem simplilearnEMS = new SimplilearnEMS();
		simplilearnEMS.createEmployee();
		simplilearnEMS.updateEmployee();
		simplilearnEMS.calculateEmployeeSalary();
		simplilearnEMS.getEmployeeByID();
		simplilearnEMS.removeEmployee();
		
		System.out.println("\n\nAccessing the ABC EMP");
		EmployeeManagementSystem ABCEMS = new SimplilearnEMS();
		ABCEMS.createEmployee();
		ABCEMS.updateEmployee();
		ABCEMS.calculateEmployeeSalary();
		ABCEMS.getEmployeeByID();
		ABCEMS.removeEmployee();
		

	}

}
