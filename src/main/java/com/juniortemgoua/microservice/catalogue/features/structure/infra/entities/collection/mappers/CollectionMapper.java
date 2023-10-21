package com.juniortemgoua.microservice.catalogue.features.structure.infra.entities.collection.mappers;

import com.juniortemgoua.microservice.catalogue.features.structure.domain.entities.Collection;
import com.juniortemgoua.microservice.catalogue.features.structure.domain.ports.secondary.entities.CollectionInterface;
import com.juniortemgoua.microservice.catalogue.features.structure.infra.entities.collection.CollectionEntityMysql;
import com.juniortemgoua.microservice.catalogue.features.structure.infra.entities.collection.CollectionEntityPostgresql;
import com.juniortemgoua.library.core.utilities.enums.DatabaseEnum;
import com.juniortemgoua.library.core.utilities.interfaces.DbEntityMapper;
import com.juniortemgoua.microservice.catalogue.features.structure.infra.entities.collection.CollectionEntityMongo;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;

/**
 * .
 */
@Configuration
public class CollectionMapper implements DbEntityMapper<Collection, CollectionInterface> {

  @Value("app.prod.database")
  private DatabaseEnum currentDb;

  @Override
  public CollectionInterface mapToInfraEntity(Collection domainEntity) {
    return switch (currentDb){
      case MYSQL -> CollectionEntityMysql.builder()
              .title(domainEntity.getTitle())
              .build();
      case MONGO -> CollectionEntityMongo.builder()
              .title(domainEntity.getTitle())
              .build();
      case POSTGRES -> CollectionEntityPostgresql.builder()
              .title(domainEntity.getTitle())
              .build();
    };
  }

  @Override
  public Collection mapToDomainEntity(CollectionInterface infraEntity) {
    return Collection.builder()
            .title(infraEntity.getTitle())
            .build();
  }
}