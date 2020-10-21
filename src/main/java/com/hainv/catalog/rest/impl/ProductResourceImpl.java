package com.hainv.catalog.rest.impl;

import com.hainv.catalog.rest.ProductResource;
import com.hainv.catalog.rest.request.CreateProductReq;
import com.hainv.catalog.service.ProductService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;

@RestController
public class ProductResourceImpl implements ProductResource {

    private final ProductService productService;

    public ProductResourceImpl(ProductService productService) {
        this.productService = productService;
    }

    @Override
    public ResponseEntity<?> createProduct(@Valid CreateProductReq createProductReq) {
        return null;
    }

    @Override
    public ResponseEntity<?> getProducts() {
        return null;
    }

    @Override
    public ResponseEntity<?> getProductDetail(Long productId) {
        return null;
    }

    @Override
    public ResponseEntity<?> updateProduct(Long productId) {
        return null;
    }

    @Override
    public ResponseEntity<?> getVariants(Long productId) {
        return null;
    }
}
