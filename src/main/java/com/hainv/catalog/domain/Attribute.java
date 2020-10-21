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
public class Attribute {
    private Long id;
    private String name;
    private List<AttributeValue> values;
}
