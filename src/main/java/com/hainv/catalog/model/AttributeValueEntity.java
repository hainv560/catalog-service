package com.hainv.catalog.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@EqualsAndHashCode(callSuper = true)
@Entity
@Table(name = "attribute_values")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class AttributeValueEntity extends AuditEntity{

    @Id
    private Long id;

    @Column(name = "value")
    private String value;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "attribute_id")
    private AttributeEntity attribute;

}
