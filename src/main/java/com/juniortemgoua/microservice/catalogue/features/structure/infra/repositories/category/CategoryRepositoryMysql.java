package com.juniortemgoua.microservice.catalogue.features.structure.infra.repositories.category;

import com.juniortemgoua.microservice.catalogue.features.structure.domain.ports.secondary.repositories.CategoryRepositoryInterface;
import com.juniortemgoua.microservice.catalogue.features.structure.infra.entities.category.CategoryEntityMysql;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * .
 */
@Repository
public interface CategoryRepositoryMysql
        extends CategoryRepositoryInterface, JpaRepository<CategoryEntityMysql, String> {
}
