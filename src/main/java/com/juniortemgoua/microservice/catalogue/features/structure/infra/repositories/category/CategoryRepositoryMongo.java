package com.juniortemgoua.microservice.catalogue.features.structure.infra.repositories.category;

import com.juniortemgoua.microservice.catalogue.features.structure.domain.ports.secondary.repositories.CategoryRepositoryInterface;
import com.juniortemgoua.microservice.catalogue.features.structure.infra.entities.category.CategoryEntityMongo;
import com.juniortemgoua.microservice.catalogue.app.infra.database.mongodb.BaseRepositoryMongo;
import org.springframework.stereotype.Repository;

/**
 * .
 */
@Repository
public interface CategoryRepositoryMongo
        extends CategoryRepositoryInterface, BaseRepositoryMongo<CategoryEntityMongo, String> {
}