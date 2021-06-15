package mapper;

import dto.UserBodyImperialValuesDTO;
import model.UserBodyValues;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Named;
import org.mapstruct.factory.Mappers;

@Mapper
public interface UserBodyValuesMapper {

	UserBodyValuesMapper INSTANCE = Mappers.getMapper(UserBodyValuesMapper.class);

	@Mapping(target = "centimeter", source = "inch", qualifiedByName = "inchToCentimeter")
	@Mapping(target = "kilogram", source = "pound", qualifiedBy = PoundToKilogram.class)
	public UserBodyValues userBodyValuesMapper(UserBodyImperialValuesDTO dto);

	@Named("inchToCentimeter")
	public static double inchToCentimeter(int inch) {
		return inch * 2.54;
	}

	@PoundToKilogram
	public static double poundToKilogram(int pound) {
		return pound * 0.4535;
	}
}
