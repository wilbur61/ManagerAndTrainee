package org.mgr.pkg;

public class Employee {
	private long employeeId;
	private String employeeName;
	private String employeeAddress;
	private long employeePhone;
	private double basicSalary;
	double specialAllowance = 250.80;
	double hra = 1000.50;
	
	public Employee() {
		
	}
	
	public Employee(long id, String name, String address, long phone, double salary) {
		setEmployeeId(id);
		setEmployeeName(name);
		setEmployeeAddress(address);
		setEmployeePhone(phone);
		setBasicSalary(salary);
	}

	public long getEmployeeId() {
		return employeeId;
	}

	public void setEmployeeId(long employeeId) {
		this.employeeId = employeeId;
	}

	public String getEmployeeName() {
		return employeeName;
	}

	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}

	public String getEmployeeAddress() {
		return employeeAddress;
	}

	public void setEmployeeAddress(String employeeAddress) {
		this.employeeAddress = employeeAddress;
	}

	public long getEmployeePhone() {
		return employeePhone;
	}

	public void setEmployeePhone(long employeePhone) {
		this.employeePhone = employeePhone;
	}

	public double getBasicSalary() {
		return basicSalary;
	}

	public void setBasicSalary(double basicSalary) {
		this.basicSalary = basicSalary;
	}
	
	public void calculateSalary() {
		double salary = basicSalary + (basicSalary * (specialAllowance / 100)) + (basicSalary * (hra / 100));
		System.out.printf("Salary for %s is $%.2f.", employeeName, salary);
		System.out.println();
	}
	
	public void calculateTransportAllowance() {
		double transportAllowance = 0.1 * basicSalary;
		System.out.printf("Transport allowance for %s is $%.2f.", employeeName, transportAllowance);
		System.out.println();
	}
}