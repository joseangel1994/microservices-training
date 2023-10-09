package com.microservices.accounts.mapper;

import com.microservices.accounts.dto.CustomerDto;
import com.microservices.accounts.entity.Customer;
import org.mapstruct.Mapper;

@Mapper
public interface CustomerMapper {
    CustomerDto toDto(Customer customer);

    Customer toEntity(CustomerDto customerDto);
}
