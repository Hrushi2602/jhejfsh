package com.sb.ems.mapper;

import com.sb.ems.dto.EmployeeDto;
import com.sb.ems.entity.Employee;

public class EmployeeMapper {

	
	public static EmployeeDto mapToEmployeeDto(Employee employee) {
		
		return new EmployeeDto(
				employee.getId();
				employee.getFirstNaame();
				employee.getLastName();
				employee.getEmail();
				);
	
	}
	
	
	public static Employee maptoEmployee(EmployeeDto employeeDto) {
		return new Employee(
				employeeDto.getId();
				employeeDto.getFirstName();
				employeeDto.getLastName();
				employeeDto.getEmail();
				);
				
	}
}
