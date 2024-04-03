package com.hoangquan.springboot.crud.service;

import com.hoangquan.springboot.crud.entity.Employee;

import java.util.List;
import java.util.Optional;

public interface EmployeeService {

    List<Employee> findAll();

    Optional<Employee> findById(int id);

    Employee save(Employee employee);

    Employee update(Employee employee, int id);

    void deleteById(int id);

    void deleteAll();
}
