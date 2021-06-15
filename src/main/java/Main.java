import static mapper.CarMapper.MAPPER;

import dto.CarDto;
import dto.EmployeeDto;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import mapper.EmployeeMapper;
import model.Car;
import model.Employee;
import model.Engine;

public class Main {

	public static void main(String[] args) {
		Car car = new Car("Poldon",  5, "FSO", new Engine("V8", 1600), LocalDate.now());

//		CarDto dto = MAPPER.carToCarDto(car);
//		System.out.println(dto);

//		System.out.println(MAPPER.carDtoToCar(dto));

//		Employee employee = new Employee("jan", "kowalski");
//		List<Employee> employeeList = new ArrayList<>();
//		employeeList.add(employee);
//		List<EmployeeDto> eDto = EmployeeMapper.EMPLOYEE_MAPPER.map(employeeList);
//		System.out.println(eDto);
	}
}
