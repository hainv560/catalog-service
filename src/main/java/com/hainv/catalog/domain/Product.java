package com.hainv.catalog.domain;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class Product {
    private Long id;
    private String name;
    private String description;
    private Double price;
    private String sku;
    private Double discount;
    private String tags;
    private String type;
    private String vendor;
    private List<ProductVariant> variants;
}
