package com.danielbray.backend.repository;

import com.danielbray.backend.model.Employee;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * EmployeeRepository
 */
@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Long> {

}
