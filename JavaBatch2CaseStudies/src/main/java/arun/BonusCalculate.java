package arun;

public class BonusCalculate extends Departments {
	public static void main(String args[]) {

		Sales_DepartMent sales = new Sales_DepartMent();
		HR_Department hr = new HR_Department();
		Operation_Department operation = new Operation_Department();
		Marketing_Department marketing = new Marketing_Department();

		sales.calIncentive(10000);
		operation.cal_Hra_allowance(13500);
		hr.calBonus(15000);
		marketing.cal_Travel_allowance(12000);

		System.out.println(
				"Department   \t     Basic_Salary     incentive     hra_allowance   travel_allowance   Bonus  \t    Total Salary\n"
						+ "------------------------------------------------------------------------------------------------------------------- ");

		sales.displayTotalSalary("Sales Dept");
		hr.displayTotalSalary("HR Dept  ");
		operation.displayTotalSalary("Operation Dept");
		marketing.displayTotalSalary("Marketing Dept");
	}
}
