package com.example.simpleemployeemanagementsystemwebapplication.repository;

import com.example.simpleemployeemanagementsystemwebapplication.model.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeRepository extends JpaRepository<Employee,Long>{
}
