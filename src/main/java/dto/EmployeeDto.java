package dto;

public class EmployeeDto {
	private String firstName;
	private String lastName;
	private String fullName;

	public EmployeeDto(String firstName, String lastName, String fullName) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.fullName = fullName;
	}

	public EmployeeDto() {
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getFullName() {
		return fullName;
	}

	public void setFullName(String fullName) {
		this.fullName = fullName;
	}

	@Override
	public String toString() {
		return "EmployeeDto{" +
			"firstName='" + firstName + '\'' +
			", lastName='" + lastName + '\'' +
			", fullName='" + fullName + '\'' +
			'}';
	}
}
