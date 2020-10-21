package com.hainv.catalog.repository;

import com.hainv.catalog.model.ProductTypeEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductTypeRepository extends JpaRepository<ProductTypeEntity,Long> {
}
