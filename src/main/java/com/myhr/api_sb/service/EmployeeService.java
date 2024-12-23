package com.myhr.api_sb.service;

import com.myhr.api_sb.model.Employee;
import com.myhr.api_sb.repository.EmployeeProxy;
import com.myhr.api_sb.repository.EmployeeRepository;
import lombok.Data;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Data
@Service
public class EmployeeService {
    @Autowired
    private EmployeeRepository employeeRepository;
    @Autowired
    private EmployeeProxy employeeProxy;


    public Optional<Employee> getEmployee(final Long id) {
        return employeeRepository.findById(id);
    }
    public Iterable<Employee> getEmployees() {
        return employeeRepository.findAll();
    }
    public void deleteEmployee(final Long id) {
        employeeRepository.deleteById(id);
    }
    public Employee saveEmployee(Employee employee) {
        Employee savedEmployee = employeeRepository.save(employee);
        return savedEmployee;
    }
}
