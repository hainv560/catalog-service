package com.hainv.catalog.repository;

import com.hainv.catalog.model.VendorEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface VendorRepository extends JpaRepository<VendorEntity,Long> {
}
