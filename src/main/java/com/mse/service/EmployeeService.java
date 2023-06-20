package com.mse.service;

import java.util.List;

import org.springframework.stereotype.Component;

import com.mse.entity.binding.EmployeeDetailsDTO;
import com.mse.projection.EmployeeProjection;

@Component
public interface EmployeeService {
	
	
	//public List<EmployeeDetailsDTO> saveEmployee(List<EmployeeDetailsDTO> dto,Integer instituteId);
	
	public List<EmployeeProjection> saveEmployee(List<EmployeeDetailsDTO> dto,Integer instituteId);

	
	//public EmployeeDetailsDTO updateEmployee(EmployeeDetailsDTO dto, Integer instituteId, Integer employeeId);
	
	public EmployeeProjection updateEmployee(EmployeeDetailsDTO dto, Integer instituteId, Integer employeeId);

	
	
	public EmployeeProjection getEmployee(Integer instituteId,Integer employeeId);
	
	public List<EmployeeProjection> getAllEmployees(Integer instituteId);
	
	public void  deleteEmployee(Integer instituteId,Integer employeeId);


	
	

}
