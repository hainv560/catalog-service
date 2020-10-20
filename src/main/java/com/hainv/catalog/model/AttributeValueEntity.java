package com.hainv.catalog.model;

import com.hainv.catalog.model.id.ProductAttributeId;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@EqualsAndHashCode(callSuper = true)
@Entity
@Table(name = "attribute_values")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class AttributeValueEntity extends AuditEntity{

    @EmbeddedId
    private ProductAttributeId id;

    @ManyToOne
    @MapsId("productVariantId")
    @JoinColumn(name = "product_variant_id")
    private ProductVariantEntity productVariant;

    @ManyToOne
    @MapsId("attributeId")
    @JoinColumn(name = "attribute_id")
    private AttributeEntity attribute;

    @Column(name = "value")
    private String value;
}
