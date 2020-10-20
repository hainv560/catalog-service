package com.hainv.catalog.mapper;

import com.hainv.catalog.domain.Product;
import com.hainv.catalog.model.ProductEntity;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface ProductEntityMapper extends EntityMapper<ProductEntity, Product>{
}
