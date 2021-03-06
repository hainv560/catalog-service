package com.hainv.catalog.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.MapsId;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import java.util.Set;

@Table(name = "products")
@Entity
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Data
@EqualsAndHashCode(callSuper = true)
public class ProductEntity extends AuditEntity{

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "name")
    private String name;

    @Column(name = "description")
    private String description;

    @Column(name = "price")
    private Double price;

    @Column(name = "discount")
    private Double discount;

    @Column(name = "point")
    private Double point;

    @Column(name = "type")
    private String type;

    @Column(name = "vendor")
    private String vendor;

    private Boolean status;

    @Column(name = "tags")
    private String tags;

    @OneToMany(mappedBy = "product")
    private Set<ProductVariantEntity> productVariant;

    @ManyToOne(fetch = FetchType.EAGER)
    @MapsId
    @JoinColumn(name = "category_id")
    private CategoryEntity category;


}
