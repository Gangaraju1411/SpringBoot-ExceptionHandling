package com.mse.controller;

import javax.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import com.mse.entity.binding.InstituteDetailsDTO;
import com.mse.projection.InstituteProjection;
import com.mse.service.InstituteService;

@RestController
public class InstituteController {
	@Autowired
	private InstituteService service;

	@PostMapping("/institute/save")
	public ResponseEntity<InstituteProjection> saveInstitute(@Valid @RequestBody InstituteDetailsDTO dto) {

	 InstituteProjection saveInstitute = service.saveInstitute(dto);
		return ResponseEntity.ok(saveInstitute);

	}

	@PutMapping("/institute/update/{id}")
	public ResponseEntity<InstituteProjection> updateInstitute(@Valid @RequestBody InstituteDetailsDTO dto,
			@PathVariable Integer id) {

		InstituteProjection updateInstitute = service.updateInstitute(dto, id);
		return ResponseEntity.ok(updateInstitute);
	}

	@GetMapping("/institute/getinst/{instId}")
	public ResponseEntity<InstituteProjection> getEmployee(@PathVariable("instId") Integer instituteId) {
		 InstituteProjection instituteProjection = service.get(instituteId);
		return ResponseEntity.ok(instituteProjection);
	}

	@PostMapping("/institute/softdelete/{id}")
	public ResponseEntity<Void> deleteInstitute(@PathVariable Integer id) {
		service.softDelete(id);
		return new ResponseEntity<Void>(HttpStatus.NO_CONTENT);
	}

}
