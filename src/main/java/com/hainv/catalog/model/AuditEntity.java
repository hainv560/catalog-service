package com.hainv.catalog.model;

import lombok.Data;
import org.springframework.data.annotation.CreatedBy;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedBy;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import javax.persistence.Column;
import javax.persistence.EntityListeners;
import javax.persistence.MappedSuperclass;
import java.time.Instant;

@Data
@MappedSuperclass
@EntityListeners(AuditingEntityListener.class)
public abstract class AuditEntity {

    @Column(name = "created_at", updatable = false)
    @CreatedDate
    private Instant createdDate;

    @Column(name = "updated_date")
    @LastModifiedDate
    private Instant modifiedDate;

    @Column(name = "created_by",updatable = false)
    @CreatedBy
    private String createdBy;

    @Column(name = "updated_by")
    @LastModifiedBy
    private String modifiedBy;
}
