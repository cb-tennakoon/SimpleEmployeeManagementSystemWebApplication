package com.example.simpleemployeemanagementsystemwebapplication.controller;

import com.example.simpleemployeemanagementsystemwebapplication.model.Employee;
import com.example.simpleemployeemanagementsystemwebapplication.service.EmployeeService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

//@Controller
//@RestController
@Controller
public class EmployeeController {
    EmployeeService employeeService;
    public EmployeeController(EmployeeService employeeService){
        this.employeeService = employeeService;
    }
    @GetMapping("/")
    //@ResponseBody
    public String viewHomePage(Model model){
        model.addAttribute("getAllEmployee",employeeService.getAllEmployees());
        return "index";
    }
    @GetMapping("/showAddEmployee")
    public String showAddEmployee(Model model){
        Employee employee = new Employee();
        model.addAttribute("employee",employee);
        return "addEmployee";
    }
    @PostMapping("/addEmployee")
    public String addEmployee(@ModelAttribute("employee") Employee employee){
        employeeService.addEmployee(employee);
        return "redirect:/";
    }
}
