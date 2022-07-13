package arun;

public class Sales_DepartMent extends Departments {
	public void calIncentive(double sal) {
		salary = sal;
		incentive = sal * 0.2;
		totalSalary = salary + incentive;
	}
}
