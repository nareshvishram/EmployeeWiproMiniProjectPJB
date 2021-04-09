package Management;

public class DesignationCode {

	private String code;
	private String designation;
	private int da;

	public DesignationCode(String code, String designation, int da) {
		super();
		this.code = code;
		this.designation = designation;
		this.da = da;
	}

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public String getDesignation() {
		return designation;
	}

	public void setDesignation(String designation) {
		this.designation = designation;
	}

	public int getDa() {
		return da;
	}

	public void setDa(int da) {
		this.da = da;
	}

	@Override
	public String toString() {
		return "DesignationCode [code=" + code + ", designation=" + designation + ", da=" + da + "]";
	}

	public DesignationCode() {
		super();
	}

}
