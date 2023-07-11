package com.example.springbootscaffold.feature.catalogue.infra.entities.collection.mappers;

import com.example.springbootscaffold.feature.catalogue.domain.entities.Collection;
import com.example.springbootscaffold.core.utils.interfaces.Mapper;
import com.example.springbootscaffold.feature.catalogue.infra.entities.collection.CollectionEntityPostgresql;

/**
 * .
 */
public class CataloguePostgresqlMapper implements Mapper<CollectionEntityPostgresql, Collection> {

  @Override
  public Collection mapFrom(CollectionEntityPostgresql entity) {
    return null;
  }
}