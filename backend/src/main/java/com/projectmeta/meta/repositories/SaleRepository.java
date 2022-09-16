package com.projectmeta.meta.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.projectmeta.meta.entities.Sale;

public interface SaleRepository extends JpaRepository<Sale, Long>{

}
