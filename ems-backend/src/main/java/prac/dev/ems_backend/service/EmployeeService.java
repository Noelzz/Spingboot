package prac.dev.ems_backend.service;

import prac.dev.ems_backend.dto.EmployeeDto;
import prac.dev.ems_backend.entity.Employee;

import java.util.List;

public interface EmployeeService {
    EmployeeDto createEmployee(EmployeeDto employeeDto);

    EmployeeDto getEmployeeById(Long id);

    List<EmployeeDto> getAllEmployees();

    EmployeeDto updateEmployee (Long employeeId, EmployeeDto updatedEmployee);

    void deleteEmployee(Long employeeId);



}
