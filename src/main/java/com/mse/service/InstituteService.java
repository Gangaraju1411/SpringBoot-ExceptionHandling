package com.mse.service;

import org.springframework.stereotype.Component;

import com.mse.entity.InstituteEntity;
import com.mse.entity.binding.InstituteDetailsDTO;
import com.mse.projection.InstituteProjection;

@Component
public interface InstituteService {
	
	
	public InstituteProjection saveInstitute(InstituteDetailsDTO dto);
	
	
	public InstituteProjection get(Integer id);

	
	public InstituteProjection updateInstitute(InstituteDetailsDTO dto, Integer id);
	
	public void softDelete(Integer id);
	
	


}
