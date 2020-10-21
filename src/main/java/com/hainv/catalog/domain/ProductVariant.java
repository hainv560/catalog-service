package com.hainv.catalog.domain;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class ProductVariant {
    private String sku;
    private Long quantity;
    private Double price;
    private Integer position;
    private String barcode;
    private Attribute attribute;
}
