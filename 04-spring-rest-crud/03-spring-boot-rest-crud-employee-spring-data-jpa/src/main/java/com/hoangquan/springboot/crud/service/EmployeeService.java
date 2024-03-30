package com.hoangquan.springboot.crud.service;

import com.hoangquan.springboot.crud.entity.Employee;

import java.util.List;

public interface EmployeeService {

    Employee updateEmployee(int id, Employee employee);

    Employee save(Employee employee);
}
