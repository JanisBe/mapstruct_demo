package model;

public class UserBodyValues {
	private double kilogram;
	private double centimeter;

	public UserBodyValues(double kilogram, double centimeter) {
		this.kilogram = kilogram;
		this.centimeter = centimeter;
	}

	public UserBodyValues() {
	}

	public double getKilogram() {
		return kilogram;
	}

	public void setKilogram(double kilogram) {
		this.kilogram = kilogram;
	}

	public double getCentimeter() {
		return centimeter;
	}

	public void setCentimeter(double centimeter) {
		this.centimeter = centimeter;
	}
}
