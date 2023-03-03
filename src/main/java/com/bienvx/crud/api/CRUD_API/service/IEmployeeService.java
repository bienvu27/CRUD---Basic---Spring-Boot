package com.bienvx.crud.api.CRUD_API.service;

import com.bienvx.crud.api.CRUD_API.model.Employee;

import java.util.List;

public interface IEmployeeService {

    //    Thêm nhân viên
    public Employee addEmployee(Employee employee);

    //    Chỉnh sửa thông tin nhân viên
    public Employee updateEmployee(long id, Employee employee);

    //    Xóa nhân viên
    public boolean deleteEmployee(long id);

    //    Lấy ra danh sách nhân viên
    public List<Employee> getAllEmployee();

    //    Lây ra một nhân viên
    public Employee getOneEmployee(long id);

}
