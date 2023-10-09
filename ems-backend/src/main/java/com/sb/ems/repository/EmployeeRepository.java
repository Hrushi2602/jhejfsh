package com.sb.ems.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.sb.ems.entity.Employee;

public interface EmployeeRepository  extends JpaRepository<Employee, Long>{
 
}
