package com.example.springbootscaffold.feature.catalogue.infra.adapters.repositories.collection;

import com.example.springbootscaffold.feature.catalogue.domain.ports.secondary.repositories.ICollectionRepository;
import com.example.springbootscaffold.feature.catalogue.infra.entities.collection.CollectionEntityPostgresql;
import org.springframework.stereotype.Repository;

/**
 * .
 */
@Repository
public interface CollectionRepositoryPostgresql
        extends ICollectionRepository<CollectionEntityPostgresql, String> {
}