package com.example.productapi2.mapper;

import com.example.productapi2.dto.EmployeeDto;
import com.example.productapi2.entity.Employee;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface EmployeeMapper {

    EmployeeDto toEmployeeDto(Employee employee);

    Employee employee(EmployeeDto employeeDto);
}
