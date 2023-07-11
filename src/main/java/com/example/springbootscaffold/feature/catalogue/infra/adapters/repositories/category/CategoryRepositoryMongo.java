package com.example.springbootscaffold.feature.catalogue.infra.adapters.repositories.category;

import com.example.springbootscaffold.feature.catalogue.domain.ports.secondary.repositories.ICategoryRepository;
import com.example.springbootscaffold.feature.catalogue.infra.entities.category.CategoryEntityMongo;
import com.example.springbootscaffold.infra.database.mongodb.BaseRepositoryMongo;
import org.springframework.stereotype.Repository;

/**
 * .
 */
@Repository
public interface CategoryRepositoryMongo
        extends ICategoryRepository<CategoryEntityMongo, String>, BaseRepositoryMongo<CategoryEntityMongo, String> {
}