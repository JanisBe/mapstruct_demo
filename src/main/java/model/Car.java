package model;


import java.time.LocalDate;
import java.util.Objects;

public class Car {

	private String name;
	private int numberOfSeats;
	private String manufacturer;
	private Engine engine;
	private LocalDate manufacturingDate;

	public Car() {

	}

	public Car(String name, int numberOfSeats, String manufacturer,
		Engine engine, LocalDate manufacturingDate) {
		this.name = name;
		this.numberOfSeats = numberOfSeats;
		this.manufacturer = manufacturer;
		this.engine = engine;
		this.manufacturingDate = manufacturingDate;
	}

	protected boolean canEqual(final Object other) {
		return other instanceof Car;
	}

	public boolean equals(final Object o) {
		if (o == this) {
			return true;
		}
		if (!(o instanceof Car)) {
			return false;
		}
		final Car other = (Car) o;
		if (!other.canEqual((Object) this)) {
			return false;
		}
		final Object this$name = this.getName();
		final Object other$name = other.getName();
		if (!Objects.equals(this$name, other$name)) {
			return false;
		}
		if (this.getNumberOfSeats() != other.getNumberOfSeats()) {
			return false;
		}
		final Object this$manufacturer = this.getManufacturer();
		final Object other$manufacturer = other.getManufacturer();
		if (!Objects.equals(this$manufacturer, other$manufacturer)) {
			return false;
		}
		final Object this$engine = this.getEngine();
		final Object other$engine = other.getEngine();
		if (!Objects.equals(this$engine, other$engine)) {
			return false;
		}
		return true;
	}

	public Engine getEngine() {
		return this.engine;
	}

	public String getManufacturer() {
		return this.manufacturer;
	}

	public String getName() {
		return this.name;
	}

	public int getNumberOfSeats() {
		return this.numberOfSeats;
	}

	public int hashCode() {
		final int PRIME = 59;
		int result = 1;
		final Object $name = this.getName();
		result = result * PRIME + ($name == null ? 43 : $name.hashCode());
		result = result * PRIME + this.getNumberOfSeats();
		final Object $manufacturer = this.getManufacturer();
		result = result * PRIME + ($manufacturer == null ? 43 : $manufacturer.hashCode());
		final Object $engine = this.getEngine();
		result = result * PRIME + ($engine == null ? 43 : $engine.hashCode());
		return result;
	}

	public void setEngine(Engine engine) {
		this.engine = engine;
	}

	public void setManufacturer(String manufacturer) {
		this.manufacturer = manufacturer;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setNumberOfSeats(int numberOfSeats) {
		this.numberOfSeats = numberOfSeats;
	}

	public LocalDate getManufacturingDate() {
		return manufacturingDate;
	}

	public void setManufacturingDate(LocalDate manufacturingDate) {
		this.manufacturingDate = manufacturingDate;
	}

	@Override
	public String toString() {
		return "Car{" +
			"name='" + name + '\'' +
			", numberOfSeats=" + numberOfSeats +
			", manufacturer='" + manufacturer + '\'' +
			", engine=" + engine +
			", manufacturingDate=" + manufacturingDate +
			'}';
	}
}
