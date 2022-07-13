package arun;

public class Operation_Department extends Departments {
	public void cal_Hra_allowance(double sal) {
		salary = sal;
		hraAllowance = 6400;
		totalSalary = salary + hraAllowance;
	}
}
