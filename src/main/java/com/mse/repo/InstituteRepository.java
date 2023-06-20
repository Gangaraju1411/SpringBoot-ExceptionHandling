package com.mse.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.mse.entity.InstituteEntity;

public  interface InstituteRepository extends JpaRepository<InstituteEntity, Integer> {

}
