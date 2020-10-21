package com.hainv.catalog.model;

import com.hainv.catalog.domain.Attribute;
import com.vladmihalcea.hibernate.type.json.JsonBinaryType;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.Type;
import org.hibernate.annotations.TypeDef;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.MapsId;
import javax.persistence.Table;

@Table(name = "product_variants")
@Entity
@TypeDef(
        name = "jsonb",
        typeClass = JsonBinaryType.class
)
@NoArgsConstructor
@AllArgsConstructor
@Data
@Builder
@EqualsAndHashCode(callSuper = true)
public class ProductVariantEntity extends AuditEntity{

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String sku;

    private Long quantity;

    private Double price;

    private Integer position;

    @Column(columnDefinition = "jsonb",name = "attributes")
    @Type(type = "jsonb")
    private Attribute attributes;

    @ManyToOne(fetch = FetchType.EAGER)
    @MapsId
    @JoinColumn(name = "product_id")
    private ProductEntity product;

}
