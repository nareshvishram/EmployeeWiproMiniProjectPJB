package Management;

public class Employee {
	private int empNo;
	private String empName;
	private String joinDate;
	private DesignationCode dc;
	private int basic;
	private int hra;
	private int it;
	private String department;

	public Employee(int empNo, String empName, String joinDate, DesignationCode dc, String department, int basic,
			int hra, int it) {
		super();
		this.empNo = empNo;
		this.empName = empName;
		this.joinDate = joinDate;
		this.dc = dc;
		this.basic = basic;
		this.hra = hra;
		this.it = it;
		this.department = department;
	}

	public Employee() {
		super();
	}

	public int getEmpNo() {
		return empNo;
	}

	public void setEmpNo(int empNo) {
		this.empNo = empNo;
	}

	public String getEmpName() {
		return empName;
	}

	public void setEmpName(String empName) {
		this.empName = empName;
	}

	public String getJoinDate() {
		return joinDate;
	}

	public void setJoinDate(String joinDate) {
		this.joinDate = joinDate;
	}

	public DesignationCode getDc() {
		return dc;
	}

	public void setDc(DesignationCode dc) {
		this.dc = dc;
	}

	public int getBasic() {
		return basic;
	}

	public String getDepartment() {
		return department;
	}

	public void setDepartment(String department) {
		this.department = department;
	}

	public void setBasic(int basic) {
		this.basic = basic;
	}

	public int getHra() {
		return hra;
	}

	public void setHra(int hra) {
		this.hra = hra;
	}

	public int getIt() {
		return it;
	}

	public void setIt(int it) {
		this.it = it;
	}

	@Override
	public String toString() {
		return "Employee [empNo=" + empNo + ", empName=" + empName + ", joinDate=" + joinDate + ", dc=" + dc
				+ ", basic=" + basic + ", hra=" + hra + ", it=" + it + "]";
	}

}
