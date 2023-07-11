package com.example.springbootscaffold.feature.catalogue.infra.adapters.repositories.category;

import com.example.springbootscaffold.feature.catalogue.domain.ports.secondary.repositories.ICategoryRepository;
import com.example.springbootscaffold.feature.catalogue.infra.entities.category.CategoryEntityMysql;
import com.example.springbootscaffold.infra.database.mysql.BaseRepositoryMysql;
import org.springframework.stereotype.Repository;

/**
 * .
 */
@Repository
public interface CategoryRepositoryMysql
        extends ICategoryRepository<CategoryEntityMysql, String> {
}
