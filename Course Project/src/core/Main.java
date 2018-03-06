package core;

public class Main {
	public static class employee {
		private String name;
		private double salary;

		public employee(String string, double d) {
			name = string;
			salary = d;
		}

		public Boolean raiseSalary(double input) {
			// Method takes input of a double, which is the percentage raise that the
			// employee will receive.
			// Method requires a properly constructed employee object.
			// Method edits-in-place the salary value of the object. adding input percent to
			// said value.
			if (this.salary != 0.0) {
				this.salary += this.salary * input;
				System.out.printf("%s's Salary was increased by %4.2f to %7.2f dollars monthly.", this.name, input,
						this.salary);
				return true;
			} else {
				System.out.printf(
						"Employee %s was not correctly initialized. please double check that they were input correctly.", this.getName());
				return false;
			}
		}

		public double getSalary() {
			return this.salary;
		}

		public String getName() {
			return this.name;
		}
	}

	public static int testEmployee() {
		int succ = 0;
		String testCaseString[] = { "Jones, Alan", "Mejia, Carlos", "Franco, Karen", "Lazari, Mikela" };
		double testCaseDouble[] = { 50000.00, 25000.00, 3.50, 0.0 };
		double testCaseRaise[] = { 0.10, 0.50, 0.01, 1.0 };
		double expectedEndSalary[] = { 55000.0, 37500.0, 3.535, 0.0 };
		for (int i = 0; i <= 3; i++) {
			employee e = new employee(testCaseString[i], testCaseDouble[i]);
			if (e.raiseSalary(testCaseRaise[i]) == true) {
				if (e.getSalary() == expectedEndSalary[i]) {
					System.out.printf(
							"for Employee %s, a raise of %f from starting salary %f,\ngives an ending salary of %f, expected output was %f\n",
							e.getName(), testCaseRaise[i], testCaseDouble[i], e.getSalary(), expectedEndSalary[i]);
					succ++;
				}
			}
		}
		return succ;

	}

	public static void main(String[] args) {
		System.out.println("Testing class 'Employee' using custom method");
		System.out.printf("%d tests succeeded.", testEmployee());
	}
}
