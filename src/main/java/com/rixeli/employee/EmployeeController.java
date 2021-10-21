package com.rixeli.employee;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Optional;

@RestController
@RequestMapping("emp")
public class EmployeeController {

    @Autowired
    private EmployeeRepository employeeRepository;

    @GetMapping("get/{id}")
    public Optional<Employee> get(@PathVariable Integer id){
        return employeeRepository.findById(id);
    }

    @GetMapping("add/{id}")
    public boolean add(@PathVariable Integer id){
        Employee employee = new Employee(id, "name"+id);
        employeeRepository.save(employee);
        return true;
    }

}
