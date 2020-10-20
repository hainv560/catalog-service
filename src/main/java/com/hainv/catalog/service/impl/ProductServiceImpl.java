package com.hainv.catalog.service.impl;

import com.hainv.catalog.domain.Product;
import com.hainv.catalog.mapper.ProductEntityMapper;
import com.hainv.catalog.repository.ProductRepository;
import com.hainv.catalog.rest.request.CreateProductReq;
import com.hainv.catalog.service.ProductService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Service
@Slf4j
public class ProductServiceImpl implements ProductService {

    private final ProductRepository productRepository;

    private final ProductEntityMapper productEntityMapper;

    public ProductServiceImpl(ProductRepository productRepository, ProductEntityMapper productEntityMapper) {
        this.productRepository = productRepository;
        this.productEntityMapper = productEntityMapper;
    }

    @Override
    public Product createProduct(CreateProductReq createProductReq) {
        return null;
    }
}
