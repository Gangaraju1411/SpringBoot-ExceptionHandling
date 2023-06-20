package com.mse.controller;

import java.util.List;
import javax.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.mse.entity.binding.EmployeeDetailsDTO;
import com.mse.projection.EmployeeProjection;
import com.mse.service.EmployeeService;

@RestController
public class EmployeeController {
	@Autowired
	private EmployeeService empService;

	@PostMapping("/employee/save/{id}")
	public ResponseEntity<List<EmployeeProjection>> saveEmployee(@Valid @RequestBody List<EmployeeDetailsDTO> dto,
			@PathVariable("id") Integer instituteId) {

		 List<EmployeeProjection> saveEmployee = empService.saveEmployee(dto, instituteId);
		return new ResponseEntity<List<EmployeeProjection>>(saveEmployee, HttpStatus.OK);
	}

	@PutMapping("/employee/update/{instituteId}/{employeeId}")
	public ResponseEntity<EmployeeProjection> updateEmployee(@Valid @RequestBody  EmployeeDetailsDTO dto,
			@PathVariable("instituteId") Integer instituteId,@PathVariable("employeeId") Integer employeeId) {
		 EmployeeProjection updateEmployee = empService.updateEmployee(dto, instituteId,employeeId);
		return ResponseEntity.ok(updateEmployee);
	}

	@GetMapping("/employee/getAll/{instId}")
	public ResponseEntity<List<EmployeeProjection>> updateEmployee(@PathVariable("instId") Integer instituteId) {
	 List<EmployeeProjection> allEmployees = empService.getAllEmployees(instituteId);
		return ResponseEntity.ok(allEmployees);
	}

	@GetMapping("employee/getEmployee/{instId}/{empId}")
	public ResponseEntity<EmployeeProjection> getEmployee(@PathVariable("instId") Integer instituteId,
			@PathVariable("empId") Integer employeeId) {
		EmployeeProjection employee = empService.getEmployee(instituteId, employeeId);
		return new ResponseEntity<EmployeeProjection>(employee, HttpStatus.OK);
	}

	@DeleteMapping("/employee/delete/{instituteId}/{employeeId}")
	public ResponseEntity<Void> deleteEmployee(@PathVariable("instituteId") Integer instituteId,
			@PathVariable("employeeId") Integer employeeId) {
		empService.deleteEmployee(instituteId, employeeId);
		return new ResponseEntity<Void>(HttpStatus.NO_CONTENT);

	}

}
