package dto;

import java.util.Objects;

public class CarDto {

	private String name;
	private int seatCount;
	private String maker;
	private String engineVolumeAndName;
	private String manufacturingDate;

	public CarDto() {

	}

	public CarDto(String name, int seatCount, String maker,
		String engineVolumeAndName, String manufacturingDate) {
		this.name = name;
		this.seatCount = seatCount;
		this.maker = maker;
		this.engineVolumeAndName = engineVolumeAndName;
		this.manufacturingDate = manufacturingDate;
	}

	public CarDto(CarDto dto) {
	}

	protected boolean canEqual(final Object other) {
		return other instanceof CarDto;
	}

	public boolean equals(final Object o) {
		if (o == this) {
			return true;
		}
		if (!(o instanceof CarDto)) {
			return false;
		}
		final CarDto other = (CarDto) o;
		if (!other.canEqual((Object) this)) {
			return false;
		}
		final Object this$name = this.getName();
		final Object other$name = other.getName();
		if (!Objects.equals(this$name, other$name)) {
			return false;
		}
		if (this.getSeatCount() != other.getSeatCount()) {
			return false;
		}
		final Object this$maker = this.getMaker();
		final Object other$maker = other.getMaker();
		if (!Objects.equals(this$maker, other$maker)) {
			return false;
		}
		final Object this$engineVolumeAndName = this.getEngineVolumeAndName();
		final Object other$engineVolumeAndName = other.getEngineVolumeAndName();
		if (!Objects.equals(this$engineVolumeAndName, other$engineVolumeAndName)) {
			return false;
		}
		return true;
	}

	public String getEngineVolumeAndName() {
		return this.engineVolumeAndName;
	}

	public String getMaker() {
		return this.maker;
	}


	public String getName() {
		return this.name;
	}

	public int getSeatCount() {
		return this.seatCount;
	}

	public int hashCode() {
		final int PRIME = 59;
		int result = 1;
		final Object $name = this.getName();
		result = result * PRIME + ($name == null ? 43 : $name.hashCode());
		result = result * PRIME + this.getSeatCount();
		final Object $maker = this.getMaker();
		result = result * PRIME + ($maker == null ? 43 : $maker.hashCode());
		final Object $engineVolumeAndName = this.getEngineVolumeAndName();
		result = result * PRIME + ($engineVolumeAndName == null ? 43
			: $engineVolumeAndName.hashCode());
		return result;
	}

	public void setEngineVolumeAndName(String engineVolumeAndName) {
		this.engineVolumeAndName = engineVolumeAndName;
	}

	public void setMaker(String maker) {
		this.maker = maker;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setSeatCount(int seatCount) {
		this.seatCount = seatCount;
	}

	public String getManufacturingDate() {
		return manufacturingDate;
	}

	public void setManufacturingDate(String manufacturingDate) {
		this.manufacturingDate = manufacturingDate;
	}

	@Override
	public String toString() {
		return "CarDto{" +
			"name='" + name + '\'' +
			", seatCount=" + seatCount +
			", maker='" + maker + '\'' +
			", engineVolumeAndName='" + engineVolumeAndName + '\'' +
			", manufacturingDate='" + manufacturingDate + '\'' +
			'}';
	}
}
