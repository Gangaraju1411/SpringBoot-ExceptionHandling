package com.mse.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.mse.entity.EmployeeEntity;


public interface EmployeeRepository extends JpaRepository<EmployeeEntity,Integer>{

}
