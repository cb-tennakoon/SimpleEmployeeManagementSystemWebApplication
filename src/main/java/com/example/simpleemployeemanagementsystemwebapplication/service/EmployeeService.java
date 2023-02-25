package com.example.simpleemployeemanagementsystemwebapplication.service;

import com.example.simpleemployeemanagementsystemwebapplication.model.Employee;
import com.example.simpleemployeemanagementsystemwebapplication.repository.EmployeeRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class EmployeeService {
    EmployeeRepository employeeRepository;

    public EmployeeService(EmployeeRepository employeeRepository){
        this.employeeRepository = employeeRepository;
    }

    //get all employees
    public List<Employee> getAllEmployees(){
        return employeeRepository.findAll();
    }
    // save an employee
    public void saveEmployee(Employee employee) {
        //save employee
        employeeRepository.save(employee);
    }
    public Optional<Employee> getEmployeeById(Long id){
        Optional<Employee> employee= employeeRepository.findById(id);
        if(employee.isEmpty()){
            throw new RuntimeException("there is not matching employee");
        }
        return employee;
    }
}
