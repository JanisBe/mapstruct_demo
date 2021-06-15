package mapper;

import dto.CarDto;
import model.Car;
import model.Engine;
import org.mapstruct.AfterMapping;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.ReportingPolicy;
import org.mapstruct.factory.Mappers;

@Mapper(unmappedTargetPolicy = ReportingPolicy.ERROR)
public abstract class CarMapper {

	public static CarMapper MAPPER = Mappers.getMapper(CarMapper.class);

	@Mapping(target = "manufacturer", source = "maker")
	@Mapping(target = "engine", ignore = true)
	@Mapping(target = "manufacturingDate", source = "manufacturingDate", dateFormat = "yyyy-MM-dd")
	@Mapping(target = "numberOfSeats", source = "seatCount")
	public abstract Car mapCarDtoToCar(CarDto dto);

	@AfterMapping
	public void mapEngineVolume(CarDto dto, Car car){
		String[] engineDetails = dto.getEngineVolumeAndName().split("##");
		Engine engine = new Engine(engineDetails[0], Integer.parseInt(engineDetails[1]));
		car.setEngine(engine);
	}


}
