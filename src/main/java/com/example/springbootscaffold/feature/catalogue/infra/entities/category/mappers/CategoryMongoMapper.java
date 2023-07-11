package com.example.springbootscaffold.feature.catalogue.infra.entities.category.mappers;

import com.example.springbootscaffold.feature.catalogue.domain.entities.Category;
import com.example.springbootscaffold.core.utils.interfaces.Mapper;
import com.example.springbootscaffold.feature.catalogue.infra.entities.category.CategoryEntityMongo;

/**
 * .
 */
public class CategoryMongoMapper implements Mapper<CategoryEntityMongo, Category> {

  @Override
  public  Category  mapFrom(CategoryEntityMongo entity) {
    return Category.builder()
        .setTitle(entity.getTitle())
        .build();
  }

}