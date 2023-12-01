package com.gainjavaknowledge.springBootRestExample.repository;

import com.gainjavaknowledge.springBootRestExample.entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import java.util.List;

@RepositoryRestResource(path = "customer")
public interface EmployeeRepository extends JpaRepository<Employee, Long> {

    List<Employee> findByName(@Param("name") String name);
}
