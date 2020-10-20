package com.hainv.catalog.service.impl;

import com.hainv.catalog.domain.Attribute;
import com.hainv.catalog.mapper.AttributeEntityMapper;
import com.hainv.catalog.model.AttributeEntity;
import com.hainv.catalog.repository.AttributeRepository;
import com.hainv.catalog.rest.request.CreateAttributeReq;
import com.hainv.catalog.service.AttributeService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Slf4j
public class AttributeServiceImpl implements AttributeService {

    private final AttributeRepository attributeRepository;

    private final AttributeEntityMapper attributeEntityMapper;

    public AttributeServiceImpl(AttributeRepository attributeRepository, AttributeEntityMapper attributeEntityMapper) {
        this.attributeRepository = attributeRepository;
        this.attributeEntityMapper = attributeEntityMapper;
    }

    @Override
    @Transactional
    public Attribute createAttribute(CreateAttributeReq createAttributeReq) {
        AttributeEntity attributeEntity = AttributeEntity.builder()
                .name(createAttributeReq.getName())
                .build();
        return attributeEntityMapper.toDomain(attributeRepository.save(attributeEntity));
    }
}
