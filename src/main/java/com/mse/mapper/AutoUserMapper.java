package com.mse.mapper;

import java.util.List;

import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

import com.mse.entity.EmployeeEntity;
import com.mse.entity.InstituteEntity;
import com.mse.entity.binding.EmployeeDetailsDTO;
import com.mse.entity.binding.InstituteDetailsDTO;

@Mapper
public interface AutoUserMapper {

	AutoUserMapper MAPPER = Mappers.getMapper(AutoUserMapper.class);

	// this is not required
	InstituteDetailsDTO mapToDTO(InstituteEntity entity);

	// dto to institute entity
	InstituteEntity mapToInstituteEntity(InstituteDetailsDTO dto);

	// dto to employee entity
	List<EmployeeEntity> mapToEmpEntity(List<EmployeeDetailsDTO> dto);

}
