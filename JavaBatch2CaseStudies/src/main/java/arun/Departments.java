package arun;

public class Departments {

	double salary;
	double bonus;
	double incentive;
	double hraAllowance;
	double travelAllowance;
	double totalSalary;

	public void displayTotalSalary(String dept) {
		System.out.println(dept + "\t\t" + salary + "\t\t" + incentive + "\t\t" + hraAllowance + "\t\t"
				+ travelAllowance + "\t\t" + bonus + " \t\t" + totalSalary);
	}

	/*public void salesDept(double sal) {
		salary = sal;
		incentive = sal * 0.2;
		totalSalary = salary + incentive;
	}

	public void hrDept(double sal) {
		salary = sal;
		bonus = sal * 0.2;
		totalSalary = salary + bonus;
	}

	public void operationDept(double sal) {
		salary = sal;
		hraAllowance = 6400;
		totalSalary = salary + hraAllowance;
	}

	public void marketingDept(double sal) {
		salary = sal;
		incentive = sal * 0.2;
		travelAllowance = 1200;
		totalSalary = salary + incentive + travelAllowance + bonus;
	}*/
}