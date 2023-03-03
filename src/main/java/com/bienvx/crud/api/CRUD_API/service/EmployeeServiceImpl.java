package com.bienvx.crud.api.CRUD_API.service;

import com.bienvx.crud.api.CRUD_API.model.Employee;
import com.bienvx.crud.api.CRUD_API.repository.EmpolyeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmployeeServiceImpl implements IEmployeeService {
    @Autowired
    private EmpolyeeRepository empolyeeRepository;

    @Override
    public Employee addEmployee(Employee employee) {
        if (employee != null) {
            return empolyeeRepository.save(employee);
        }
        return null;
    }

    @Override
    public Employee updateEmployee(long id, Employee employee) {
        if (employee != null) {
            Employee employee1 = empolyeeRepository.getById(id);
            if (employee1 != null) {
                employee1.setName(employee.getName());
                employee1.setAddress(employee.getAddress());
                return empolyeeRepository.save(employee1);
            }
        }
        return null;
    }

    @Override
    public boolean deleteEmployee(long id) {
        if (id >= 1) {
            Employee employee = empolyeeRepository.getById(id);
            if (employee != null) {
                empolyeeRepository.delete(employee);
                return true;
            }
        }
        return false;
    }

    @Override
    public List<Employee> getAllEmployee() {
        return empolyeeRepository.findAll();
    }

    @Override
    public Employee getOneEmployee(long id) {
        return empolyeeRepository.getById(id);
    }
}
