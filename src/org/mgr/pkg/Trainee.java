package org.mgr.pkg;


public class Trainee extends Employee {
	public Trainee() {
		
	}
	
	public Trainee(long id, String name, String address, long phone, double salary) {
		super.setEmployeeId(id);
		super.setEmployeeName(name);
		super.setEmployeeAddress(address);
		super.setEmployeePhone(phone);
		super.setBasicSalary(salary);
	}
}