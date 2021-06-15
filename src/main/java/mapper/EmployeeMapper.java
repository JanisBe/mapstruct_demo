package mapper;

import dto.EmployeeDto;
import java.util.Set;
import model.Employee;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper
public interface EmployeeMapper {

	public static EmployeeMapper EMPLOYEE_MAPPER = Mappers.getMapper(EmployeeMapper.class);


	Set<Employee> mapSetEmployeDTOtoEmployee(Set<EmployeeDto> employeeDtos);
}
