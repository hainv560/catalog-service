package com.hainv.catalog.rest.request;

import com.hainv.catalog.domain.ProductVariant;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class CreateProductReq {
    private String name;
    private String description;
    private Double price;
    private Double point;
    private String sku;
    private Double discount;
    private String tags;
    private Long categoryId;
    private Long productTypeId;
    private Long vendorId;
    private List<ProductVariant> variants;
}
