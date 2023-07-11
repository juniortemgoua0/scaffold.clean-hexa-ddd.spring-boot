package com.example.springbootscaffold.feature.catalogue.infra.entities.category.mappers;

import com.example.springbootscaffold.feature.catalogue.domain.entities.Category;
import com.example.springbootscaffold.feature.catalogue.infra.entities.category.CategoryEntityMysql;
import com.example.springbootscaffold.core.utils.interfaces.Mapper;

/**
 * .
 */
public class CategoryMysqlMapper implements Mapper<CategoryEntityMysql, Category> {

  @Override
  public Category mapFrom(CategoryEntityMysql entity) {
    return null;
  }
}