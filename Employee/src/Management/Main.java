package Management;

public class Main {

	public static void main(String[] args) {
		Employee[] employee = new Employee[] {
				new Employee(1001, "Ashish", "01/04/2009", new DesignationCode("e", "Engineer", 20000), "R&D", 20000,
						8000, 3000),
				new Employee(1002, "Sushma", "23/08/2012", new DesignationCode("c", "Consultant", 32000), "PM", 30000,
						12000, 9000),
				new Employee(1003, "Rahul", "12/11/2008", new DesignationCode("k", "Clerk", 12000), "Acct", 10000, 8000,
						1000),
				new Employee(1004, "Chahat", "29/01/2013", new DesignationCode("r", "Receptionist", 15000),
						"Front Desk", 12000, 6000, 2000),
				new Employee(1005, "Ranjan", "16/07/2005", new DesignationCode("m", "Manager", 40000), "Engg", 50000,
						20000, 20000),
				new Employee(1006, "Suman", "01/01/2000", new DesignationCode("e", "Engineer", 20000), "Manufacturing",
						23000, 9000, 4400),
				new Employee(1007, "Tanmay", "12/06/2000", new DesignationCode("c", "Consultant", 32000), "PM", 29000,
						12000, 10000) };
		int empNo = Integer.parseInt(args[0].trim());
		boolean flag = false;
		for (Employee e : employee) {
			if (e.getEmpNo() == empNo) {
				print(e);
				flag = true;
			}
		}
		if (!flag)
			System.out.println("There is no employee with empid : " + empNo);
	}

	private static void print(Employee e) {
		StringBuffer sb = new StringBuffer("");
		System.out.println("Emp No. Emp Name Department Designation Salary");
		sb.append(e.getEmpNo() + "    ");
		sb.append(e.getEmpName() + "   ");
		sb.append(e.getDepartment() + "         ");
		sb.append(e.getDc().getCode() + "           ");
		int salary = getSalary(e);
		sb.append(salary + " ");
		System.out.println(sb.toString());

	}

	private static int getSalary(Employee e) {
		return e.getBasic() + e.getHra() + e.getDc().getDa() - e.getIt();
	}
}
