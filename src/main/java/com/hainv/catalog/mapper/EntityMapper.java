package com.hainv.catalog.mapper;

import java.util.List;

public interface EntityMapper<E, D> {
    D toDomain(E entity);

    E toEntity(D domain);

    List<D> toDomain(List<E> listEntity);
    List<E> toEntity(List<D> listDomain);
}
