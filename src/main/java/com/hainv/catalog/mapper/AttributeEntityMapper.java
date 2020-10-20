package com.hainv.catalog.mapper;

import com.hainv.catalog.domain.Attribute;
import com.hainv.catalog.model.AttributeEntity;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface AttributeEntityMapper extends EntityMapper<AttributeEntity, Attribute>{
}
