package org.mgr.pkg;

public class Manager extends Employee {
	public Manager() {
		
	}
	
	public Manager(long id, String name, String address, long phone, double salary) {
		super.setEmployeeId(id);
		super.setEmployeeName(name);
		super.setEmployeeAddress(address);
		super.setEmployeePhone(phone);
		super.setBasicSalary(salary);
	}
	
	public void calculateTransportAllowance() {
		double transportAllowance = 0.15 * super.getBasicSalary();
		System.out.printf("Transport allowance for %s is $%.2f.", super.getEmployeeName(), transportAllowance);
		System.out.println();
	}
}

