package com.hainv.catalog.repository;

import com.hainv.catalog.model.AttributeEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AttributeRepository extends JpaRepository<AttributeEntity,Long> {
}
