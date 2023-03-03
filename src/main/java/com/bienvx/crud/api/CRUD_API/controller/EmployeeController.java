package com.bienvx.crud.api.CRUD_API.controller;

import com.bienvx.crud.api.CRUD_API.model.Employee;
import com.bienvx.crud.api.CRUD_API.service.IEmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/employee")
public class EmployeeController {
    @Autowired
    private IEmployeeService iEmployeeService;

    @GetMapping("/")
    public String test() {
        return "timoday";
    }

    //    Api Add Employee
    @PostMapping("/add")
    public Employee addEmployee(@RequestBody Employee employee) {
        return iEmployeeService.addEmployee(employee);
    }

    //    Api Update Employee
    @PutMapping("/update")
    public Employee updateEmployee(@RequestParam("id") long id, @RequestBody Employee employee) {
        return iEmployeeService.updateEmployee(id, employee);
    }

    //    Api Delete Employee
    @DeleteMapping("/delete/{id}")
    public boolean deleteEmployee(@PathVariable("id") long id) {
        return iEmployeeService.deleteEmployee(id);
    }

    //    Api get lists
    @GetMapping("/list")
    public List<Employee> getAllemployee() {
        return iEmployeeService.getAllEmployee();
    }
}
