
public class Emplooye {

	public Emplooye() {

	}

	public Emplooye(String name, double salary, int workHours, int hireYear) {
		this.name = name;
		this.salary = salary;
		this.workHours = workHours;
		this.hireYear = hireYear;
	}

	private String name;
	private double salary;
	private int workHours;
	private int hireYear;

	public double tax() {

		double taxAmount = 0.0;
		if (salary < 1000) {
			return taxAmount;
		} else {
			taxAmount = salary * 0.03;
			return taxAmount;
		}
	}

	public int bonus() {
		int bonusAmount = 0;
		if (workHours <= 40) {
			return bonusAmount;
		} else {
			bonusAmount = (workHours - 40) * 30;
			return bonusAmount;
		}
	}

	public double raiseSalary() {
		double netSalary = salary + bonus() - tax();
		int totalYearsOfWork = 2021 - hireYear;
		double raiseAmount = 0.0;
		if (totalYearsOfWork < 10) {
			raiseAmount = netSalary * 0.05;
			return raiseAmount;
		} else if (totalYearsOfWork >= 10 && totalYearsOfWork < 20) {
			raiseAmount = netSalary * 0.1;
			return raiseAmount;
		} else if (totalYearsOfWork >= 20) {
			raiseAmount = netSalary * 0.15;
			return raiseAmount;
		} else {
			return raiseAmount;
		}
	}

	public String toString() {

		return ("Name: " + name + "\nSalary: " + salary + "\nWork Hours: " + workHours + "\nHire Year: " + hireYear
				+ "\nTax: " + tax() + "\nBonus: " + bonus() + "\nSalary Raise: " + raiseSalary() + "\nNet Salary: "
				+ (salary + bonus() - tax()) + "\nTotal Salary: " + (salary - tax() + bonus() + raiseSalary()));

	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getSalary() {
		return salary;
	}

	public int getWorkHours() {
		return workHours;
	}

	public void setWorkHours(int workHours) {
		this.workHours = workHours;
	}

	public int getHireYear() {
		return hireYear;
	}


}
