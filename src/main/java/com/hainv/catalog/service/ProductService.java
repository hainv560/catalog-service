package com.hainv.catalog.service;

import com.hainv.catalog.domain.Product;
import com.hainv.catalog.rest.request.CreateProductReq;

public interface ProductService {
    Product createProduct(CreateProductReq createProductReq);
}
