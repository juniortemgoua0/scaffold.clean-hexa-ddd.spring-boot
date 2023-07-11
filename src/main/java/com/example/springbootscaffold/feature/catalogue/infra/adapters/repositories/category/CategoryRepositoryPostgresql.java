package com.example.springbootscaffold.feature.catalogue.infra.adapters.repositories.category;

import com.example.springbootscaffold.feature.catalogue.domain.ports.secondary.repositories.ICategoryRepository;
import com.example.springbootscaffold.feature.catalogue.infra.entities.category.CategoryEntityPostgresql;
import org.springframework.stereotype.Repository;

/**
 * .
 */
@Repository
public interface CategoryRepositoryPostgresql
        extends ICategoryRepository<CategoryEntityPostgresql, String> {
}