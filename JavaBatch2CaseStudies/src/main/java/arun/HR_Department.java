package arun;

public class HR_Department extends Departments {
	public void calBonus(double sal) {
		salary = sal;
		bonus = sal * 0.2;
		totalSalary = salary + bonus;
	}
}
