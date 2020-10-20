package com.hainv.catalog.rest.request;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class CreateProductReq {
    private String name;
    private String description;
    private Double price;
    private Double discount;
}
