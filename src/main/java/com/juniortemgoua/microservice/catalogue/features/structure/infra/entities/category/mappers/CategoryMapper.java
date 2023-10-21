package com.juniortemgoua.microservice.catalogue.features.structure.infra.entities.category.mappers;

import com.juniortemgoua.library.core.utilities.enums.DatabaseEnum;
import com.juniortemgoua.library.core.utilities.interfaces.DbEntityMapper;
import com.juniortemgoua.microservice.catalogue.features.structure.domain.entities.Category;
import com.juniortemgoua.microservice.catalogue.features.structure.domain.ports.secondary.entities.CategoryInterface;
import com.juniortemgoua.microservice.catalogue.features.structure.infra.entities.category.CategoryEntityMongo;
import com.juniortemgoua.microservice.catalogue.features.structure.infra.entities.category.CategoryEntityMysql;
import com.juniortemgoua.microservice.catalogue.features.structure.infra.entities.category.CategoryEntityPostgresql;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;

/**
 * .
 */
@Configuration
public class CategoryMapper implements DbEntityMapper<Category, CategoryInterface> {

    @Value("app.prod.database")
    private DatabaseEnum currentDb;

    @Override
    public CategoryInterface mapToInfraEntity(Category domainEntity) {

        return switch (currentDb) {
            case MONGO -> CategoryEntityMongo.builder()
                    .title(domainEntity.getTitle())
                    .build();
            case MYSQL -> CategoryEntityMysql.builder()
                    .title(domainEntity.getTitle())
                    .build();
            case POSTGRES -> CategoryEntityPostgresql.builder()
                    .title(domainEntity.getTitle())
                    .build();
        };

    }

    @Override
    public Category mapToDomainEntity(CategoryInterface infraEntity) {
        return Category.builder()
                .title(infraEntity.getTitle())
                .build();
    }
}