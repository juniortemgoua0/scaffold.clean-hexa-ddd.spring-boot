package com.example.springbootscaffold.feature.catalogue.infra.entities.collection.mappers;

import com.example.springbootscaffold.core.utils.interfaces.Mapper;
import com.example.springbootscaffold.feature.catalogue.domain.entities.Collection;
import com.example.springbootscaffold.feature.catalogue.infra.entities.collection.CollectionEntityMysql;

/**
 * .
 */
public class CatalogueMysqlMapper implements Mapper<CollectionEntityMysql, Collection> {

  @Override
  public Collection mapFrom(CollectionEntityMysql entity) {
    return null;
  }
}