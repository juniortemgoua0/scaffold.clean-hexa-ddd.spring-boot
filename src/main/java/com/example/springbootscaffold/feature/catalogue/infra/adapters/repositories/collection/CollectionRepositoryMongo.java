package com.example.springbootscaffold.feature.catalogue.infra.adapters.repositories.collection;

import com.example.springbootscaffold.feature.catalogue.domain.ports.secondary.repositories.ICollectionRepository;
import com.example.springbootscaffold.feature.catalogue.infra.entities.collection.CollectionEntityMongo;
import com.example.springbootscaffold.infra.database.mongodb.BaseRepositoryMongo;
import org.springframework.stereotype.Repository;

/**
 * .
 */
@Repository
public interface CollectionRepositoryMongo
        extends ICollectionRepository<CollectionEntityMongo, String> ,
        BaseRepositoryMongo<CollectionEntityMongo, String> {
}