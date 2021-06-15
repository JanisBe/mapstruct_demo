package dto;

public class UserBodyImperialValuesDTO {
	private int inch;
	private int pound;

	public UserBodyImperialValuesDTO(int inch, int pound) {
		this.inch = inch;
		this.pound = pound;
	}

	public UserBodyImperialValuesDTO() {
	}

	public int getInch() {
		return inch;
	}

	public void setInch(int inch) {
		this.inch = inch;
	}

	public int getPound() {
		return pound;
	}

	public void setPound(int pound) {
		this.pound = pound;
	}
}
