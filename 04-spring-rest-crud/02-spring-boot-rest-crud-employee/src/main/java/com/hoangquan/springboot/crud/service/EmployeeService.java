package com.hoangquan.springboot.crud.service;

import com.hoangquan.springboot.crud.entity.Employee;

import java.util.List;

public interface EmployeeService {

    List<Employee> findAll();

    Employee findById(int id);

    Employee save(Employee employee);

    void deleteById(int id);
}
