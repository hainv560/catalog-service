package com.hainv.catalog.service.impl;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.hainv.catalog.domain.Product;
import com.hainv.catalog.domain.ProductVariant;
import com.hainv.catalog.mapper.ProductEntityMapper;
import com.hainv.catalog.model.*;
import com.hainv.catalog.repository.*;
import com.hainv.catalog.rest.request.CreateProductReq;
import com.hainv.catalog.service.ProductService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

@Service
@Slf4j
public class ProductServiceImpl implements ProductService {

    private final ProductRepository productRepository;

    private final CategoryRepository categoryRepository;

    private final VendorRepository vendorRepository;

    private final ProductTypeRepository productTypeRepository;

    private final ProductVariantRepository productVariantRepository;

    private final ProductEntityMapper productEntityMapper;

    public ProductServiceImpl(ProductRepository productRepository, CategoryRepository categoryRepository,
                              VendorRepository vendorRepository, ProductTypeRepository productTypeRepository,
                              ProductVariantRepository productVariantRepository, ProductEntityMapper productEntityMapper) {
        this.productRepository = productRepository;
        this.categoryRepository = categoryRepository;
        this.vendorRepository = vendorRepository;
        this.productTypeRepository = productTypeRepository;
        this.productVariantRepository = productVariantRepository;
        this.productEntityMapper = productEntityMapper;
    }

    @Override
    @Transactional
    public Product createProduct(CreateProductReq createProductReq) {
        Set<ProductVariantEntity> productVariantEntitySet = new HashSet<>();

        CategoryEntity category = categoryRepository.findById(createProductReq.getCategoryId()).orElseThrow();
        ProductTypeEntity productType = productTypeRepository.findById(createProductReq.getProductTypeId()).orElseThrow();
        VendorEntity vendor = vendorRepository.findById(createProductReq.getVendorId()).orElseThrow();

        List<ProductVariant> variants = createProductReq.getVariants();
        if (variants.size() > 0){
            variants.forEach(variant -> {
                ProductVariantEntity productVariant = ProductVariantEntity
                        .builder()
                        .position(variant.getPosition())
                        .price(variant.getPrice())
                        .quantity(variant.getQuantity())
                        .sku(variant.getSku())
                        .attributes(variant.getAttribute())
                        .build();
                productVariantEntitySet.add(productVariant);
            });
        }

        ProductEntity productEntity = ProductEntity
                .builder()
                .description(createProductReq.getDescription())
                .discount(createProductReq.getDiscount())
                .price(createProductReq.getPrice())
                .name(createProductReq.getName())
                .point(createProductReq.getPoint())
                .tags(createProductReq.getTags())
                .status(true)
                .category(category)
                .vendor(vendor.getName())
                .type(productType.getName())
                .productVariant(productVariantEntitySet)
                .build();

        return productEntityMapper.toDomain(productRepository.save(productEntity));
    }
}
