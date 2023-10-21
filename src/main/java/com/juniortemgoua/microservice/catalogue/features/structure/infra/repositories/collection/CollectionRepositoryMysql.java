package com.juniortemgoua.microservice.catalogue.features.structure.infra.repositories.collection;

import com.juniortemgoua.microservice.catalogue.features.structure.domain.ports.secondary.repositories.CollectionRepositoryInterface;
import org.springframework.stereotype.Repository;

/**
 * .
 * Interface for Collection repository of Mysql
 */
@Repository
public interface CollectionRepositoryMysql
        extends CollectionRepositoryInterface {
}
