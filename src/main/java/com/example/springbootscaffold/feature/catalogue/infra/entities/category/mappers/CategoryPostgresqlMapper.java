package com.example.springbootscaffold.feature.catalogue.infra.entities.category.mappers;

import com.example.springbootscaffold.feature.catalogue.domain.entities.Category;
import com.example.springbootscaffold.feature.catalogue.infra.entities.category.CategoryEntityPostgresql;
import com.example.springbootscaffold.core.utils.interfaces.Mapper;

/**
 * .
 */
public class CategoryPostgresqlMapper implements Mapper<CategoryEntityPostgresql, Category> {

  @Override
  public Category mapFrom(CategoryEntityPostgresql entity) {
    return null;
  }
}