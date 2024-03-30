package com.hoangquan.springboot.crud.dao;

import com.hoangquan.springboot.crud.entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeRepository extends JpaRepository<Employee, Integer> {
}
