package com.example.productapi2.service;

import com.example.productapi2.dto.DetailDto;
import com.example.productapi2.dto.EmployeeDto;
import com.example.productapi2.entity.Employee;

import java.util.List;

public interface EmployeeService {

    List<EmployeeDto> getAll();


    EmployeeDto getEmployeeById(int id);

    void addEmployee(EmployeeDto employeeDto);

    void deleteEmployee(int id);


}
