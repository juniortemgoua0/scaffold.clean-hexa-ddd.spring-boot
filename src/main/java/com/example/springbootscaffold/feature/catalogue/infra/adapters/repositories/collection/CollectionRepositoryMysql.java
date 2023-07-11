package com.example.springbootscaffold.feature.catalogue.infra.adapters.repositories.collection;

import com.example.springbootscaffold.feature.catalogue.domain.ports.secondary.repositories.ICollectionRepository;
import com.example.springbootscaffold.feature.catalogue.infra.entities.collection.CollectionEntityMysql;
import org.springframework.stereotype.Repository;

/**
 * .
 * Interface for Collection repository of Mysql
 */
@Repository
public interface CollectionRepositoryMysql
        extends ICollectionRepository<CollectionEntityMysql, String> {
}
