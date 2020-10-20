package com.hainv.catalog.rest.impl;

import com.hainv.catalog.rest.AttributeResource;
import com.hainv.catalog.rest.request.CreateAttributeReq;
import com.hainv.catalog.service.AttributeService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;

@RestController
public class AttributeResourceImpl implements AttributeResource {

    private final AttributeService attributeService;

    public AttributeResourceImpl(AttributeService attributeService) {
        this.attributeService = attributeService;
    }

    @Override
    public ResponseEntity<?> createAttribute(@Valid CreateAttributeReq createAttributeReq) {
        return ResponseEntity.ok(attributeService.createAttribute(createAttributeReq));
    }
}
