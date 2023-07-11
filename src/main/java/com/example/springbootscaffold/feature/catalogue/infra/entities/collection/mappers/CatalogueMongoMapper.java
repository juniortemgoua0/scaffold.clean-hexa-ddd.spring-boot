package com.example.springbootscaffold.feature.catalogue.infra.entities.collection.mappers;

import com.example.springbootscaffold.feature.catalogue.domain.entities.Collection;
import com.example.springbootscaffold.core.utils.interfaces.Mapper;
import com.example.springbootscaffold.feature.catalogue.infra.entities.collection.CollectionEntityMongo;

/**
 * .
 */
public class CatalogueMongoMapper implements Mapper<CollectionEntityMongo, Collection> {

  @Override
  public Collection mapFrom(CollectionEntityMongo entity) {

    return Collection.builder()
        .setTitle(entity.getTitle())
        .build();
  }

}