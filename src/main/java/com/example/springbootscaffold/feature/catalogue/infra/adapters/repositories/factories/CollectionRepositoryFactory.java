package com.example.springbootscaffold.feature.catalogue.infra.adapters.repositories.factories;

import com.example.springbootscaffold.feature.catalogue.domain.ports.secondary.repositories.ICollectionRepository;
import com.example.springbootscaffold.feature.catalogue.infra.adapters.repositories.collection.CollectionRepositoryMongo;
import com.example.springbootscaffold.feature.catalogue.infra.adapters.repositories.collection.CollectionRepositoryMysql;
import com.example.springbootscaffold.feature.catalogue.infra.adapters.repositories.collection.CollectionRepositoryPostgresql;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;


/**
 * .
 */
@Configuration
@EnableConfigurationProperties
@ConfigurationProperties(prefix = "database")
public class CollectionRepositoryFactory {

  private final CollectionRepositoryMongo collectionRepositoryMongo;
  private final CollectionRepositoryPostgresql collectionRepositoryPostgresql;
  private final CollectionRepositoryMysql collectionRepositoryMysql;
  @Value("${database.select}")
  private String selectedDb;

  /**
   * .
   */
  @Autowired
  public CollectionRepositoryFactory(CollectionRepositoryMongo collectionRepository,
      CollectionRepositoryPostgresql collectionRepositoryPostgresql,
      CollectionRepositoryMysql collectionRepositoryMysql) {
    this.collectionRepositoryMongo = collectionRepository;
    this.collectionRepositoryPostgresql = collectionRepositoryPostgresql;
    this.collectionRepositoryMysql = collectionRepositoryMysql;
  }

  /**
   * .
   */
  @Bean("CatalogueRepository")
  public ICollectionRepository createCatalogueRepository() {
    return switch (selectedDb) {
      case "postgresql" -> this.collectionRepositoryPostgresql;
      case "mysql" -> this.collectionRepositoryMysql;
      default -> this.collectionRepositoryMongo;
    };
  }
}