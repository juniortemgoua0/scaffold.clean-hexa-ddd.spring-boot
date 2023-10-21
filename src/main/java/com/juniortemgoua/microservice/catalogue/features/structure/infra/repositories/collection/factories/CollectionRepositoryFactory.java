package com.juniortemgoua.microservice.catalogue.features.structure.infra.repositories.collection.factories;

import com.juniortemgoua.library.core.utilities.enums.DatabaseEnum;
import com.juniortemgoua.microservice.catalogue.features.structure.domain.ports.secondary.repositories.CollectionRepositoryInterface;
import com.juniortemgoua.microservice.catalogue.features.structure.infra.repositories.collection.CollectionRepositoryMongo;
import com.juniortemgoua.microservice.catalogue.features.structure.infra.repositories.collection.CollectionRepositoryMysql;
import com.juniortemgoua.microservice.catalogue.features.structure.infra.repositories.collection.CollectionRepositoryPostgresql;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

import static com.juniortemgoua.library.core.utilities.enums.DatabaseEnum.*;


/**
 * .
 */
@Configuration
@EnableConfigurationProperties
@ConfigurationProperties(prefix = "database")
@EnableJpaRepositories
@RequiredArgsConstructor
public class CollectionRepositoryFactory {

  private final CollectionRepositoryMongo collectionRepositoryMongo;
  private final CollectionRepositoryPostgresql collectionRepositoryPostgresql;
  private final CollectionRepositoryMysql collectionRepositoryMysql;
  @Value("${app.prod.database}")
  private String selectedDb;
  private final DatabaseEnum currentDb;

  private final boolean isCorrectDbProp = this.selectedDb.equals(MONGO.toString()) ||
          this.selectedDb.equals(MYSQL.toString()) ||
          this.selectedDb.equals(POSTGRES.toString());
  {
    this.currentDb =  !isCorrectDbProp ? MYSQL: DatabaseEnum.valueOf(selectedDb);
  }

  /**
   * .
   */
  @Bean("CatalogueRepository")
  public CollectionRepositoryInterface createCatalogueRepository() {
    return switch (currentDb) {
      case POSTGRES -> this.collectionRepositoryPostgresql;
      case MYSQL -> this.collectionRepositoryMysql;
      case MONGO -> this.collectionRepositoryMongo;
    };
  }
}