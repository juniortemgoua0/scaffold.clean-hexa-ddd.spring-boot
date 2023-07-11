package com.example.springbootscaffold.feature.catalogue.infra.adapters.repositories.factories;

import com.example.springbootscaffold.feature.catalogue.infra.adapters.repositories.category.CategoryRepositoryMongo;
import com.example.springbootscaffold.feature.catalogue.domain.ports.secondary.repositories.ICategoryRepository;
import com.example.springbootscaffold.feature.catalogue.infra.adapters.repositories.category.CategoryRepositoryPostgresql;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;

/**
 * .
 */
@Configuration
@EnableJpaRepositories
    ("com.example.springbootscaffold.feature.catalogue.infra.adapters.repositories")
@EnableMongoRepositories
    ("com.example.springbootscaffold.feature.catalogue.infra.adapters.repositories")
public class CategoryRepositoryFactory {

  private final CategoryRepositoryMongo categoryRepositoryMongo;

  private final CategoryRepositoryPostgresql categoryRepositoryPostgresql;

  /**
   * .
   */
  @Autowired
  public CategoryRepositoryFactory(CategoryRepositoryMongo categoryRepositoryMongo,
      CategoryRepositoryPostgresql categoryRepositoryPostgresql) {

    this.categoryRepositoryMongo = categoryRepositoryMongo;
    this.categoryRepositoryPostgresql = categoryRepositoryPostgresql;
  }

  @Bean("CategoryRepository")
  public ICategoryRepository createCategoryRepository() {
    return this.categoryRepositoryMongo;
  }

}