/*
 * Copyright MapStruct Authors.
 *
 * Licensed under the Apache License version 2.0, available at http://www.apache.org/licenses/LICENSE-2.0
 */
package mapper;

import dto.CustomerDto;
import model.Customer;
import org.mapstruct.InheritInverseConfiguration;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;

@Mapper(uses = {OrderItemMapper.class})
public interface CustomerMapper {

	CustomerMapper MAPPER = Mappers.getMapper(CustomerMapper.class);
	@Mapping(source = "customerName", target = "name")
	@Mapping(source = "orders", target = "orderItems")
	Customer toCustomer(CustomerDto customerDto);

	@InheritInverseConfiguration
	CustomerDto fromCustomer(Customer customer);
}
