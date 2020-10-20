package com.hainv.catalog.service;

import com.hainv.catalog.domain.Attribute;
import com.hainv.catalog.rest.request.CreateAttributeReq;

public interface AttributeService {
    Attribute createAttribute(CreateAttributeReq createAttributeReq);
}
