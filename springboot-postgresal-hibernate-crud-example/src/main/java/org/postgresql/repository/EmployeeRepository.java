package org.postgresql.repository;

import org.postgresql.model.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Long>{
	//subclass : EmployeeRepository
	//parent class: JpaRepository

}