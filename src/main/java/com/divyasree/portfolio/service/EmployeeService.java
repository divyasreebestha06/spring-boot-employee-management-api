package com.divyasree.portfolio.service;

import com.divyasree.portfolio.model.Employee;
import com.divyasree.portfolio.repository.EmployeeRepository;
import java.util.List;
import java.util.Optional;

public class EmployeeService {
    private final EmployeeRepository repository;

    public EmployeeService(EmployeeRepository repository) {
        this.repository = repository;
    }

    public Employee createEmployee(String first, String last, String email, String dept, Double salary) {
        if (email == null || !email.contains("@")) {
            throw new IllegalArgumentException("Invalid email format");
        }
        Employee emp = new Employee(null, first, last, email, dept, salary);
        return repository.save(emp);
    }

    public List<Employee> getAllEmployees() {
        return repository.findAll();
    }

    public Optional<Employee> getEmployeeById(Long id) {
        return repository.findById(id);
    }

    public boolean removeEmployee(Long id) {
        return repository.deleteById(id);
    }
}
