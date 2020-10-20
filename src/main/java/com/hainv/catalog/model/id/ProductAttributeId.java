package com.hainv.catalog.model.id;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import java.io.Serializable;

@Embeddable
public class ProductAttributeId implements Serializable {

    @Column(name = "product_variant_id")
    private Long productVariantId;

    @Column(name = "attribute_id")
    private Long attributeId;

}
