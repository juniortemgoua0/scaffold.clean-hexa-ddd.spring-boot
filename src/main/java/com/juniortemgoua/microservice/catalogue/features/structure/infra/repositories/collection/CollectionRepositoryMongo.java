package com.juniortemgoua.microservice.catalogue.features.structure.infra.repositories.collection;

import com.juniortemgoua.microservice.catalogue.features.structure.domain.ports.secondary.repositories.CollectionRepositoryInterface;
import com.juniortemgoua.microservice.catalogue.features.structure.infra.entities.collection.CollectionEntityMongo;
import com.juniortemgoua.microservice.catalogue.app.infra.database.mongodb.BaseRepositoryMongo;
import org.springframework.stereotype.Repository;

/**
 * .
 */
@Repository
public interface CollectionRepositoryMongo
        extends CollectionRepositoryInterface,
        BaseRepositoryMongo<CollectionEntityMongo, String> {
}