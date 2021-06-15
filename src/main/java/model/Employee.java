package model;

import java.time.LocalDateTime;

public class Employee {
	private Long id;
	private String firstName;
	private String lastName;
	private LocalDateTime creationDate;

	public Employee(String firstName, String lastName) {
		this.firstName = firstName;
		this.lastName = lastName;
	}

	public Employee(Long id, String firstName, String lastName, LocalDateTime creationDate) {
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
		this.creationDate = creationDate;
	}

	public Employee() {
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
}
