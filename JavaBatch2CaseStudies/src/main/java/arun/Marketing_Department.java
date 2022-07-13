package arun;

public class Marketing_Department extends Departments {
	public void cal_Travel_allowance(double sal) {
		salary = sal;
		incentive = sal * 0.2;
		travelAllowance = 1200;
		totalSalary = salary + incentive + travelAllowance + bonus;
	}
}
