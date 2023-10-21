package com.juniortemgoua.microservice.catalogue.features.structure.infra.repositories.category.factories;

import com.juniortemgoua.microservice.catalogue.features.structure.domain.ports.secondary.repositories.CategoryRepositoryInterface;
import com.example.springbootscaffold.features.catalogue.infra.repositories.category.*;
import com.juniortemgoua.library.core.utilities.enums.DatabaseEnum;
import com.juniortemgoua.microservice.catalogue.features.structure.infra.repositories.category.*;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * .
 */
@Configuration
@RequiredArgsConstructor
public class CategoryRepositoryFactory {

    private final CategoryRepositoryMongo categoryRepositoryMongo;
    private final CategoryRepositoryPostgresql categoryRepositoryPostgresql;
    private final CategoryRepositoryMysql categoryRepositoryMysql;
    private final CategoryRepositoryMongoImpl categoryRepositoryMongoImpl;
    private final CategoryRepositoryPostgresqlImpl categoryRepositoryPostgresqlImpl;
    private final CategoryRepositoryMysqlImpl categoryRepositoryMysqlImpl;
    @Value("app.prod.database")
    private DatabaseEnum currentDatabase;

    @Bean("CategoryRepository")
    public CategoryRepositoryInterface selectCategoryRepository() {
        return switch (currentDatabase){
            case MONGO -> this.categoryRepositoryMongo;
            case POSTGRES -> this.categoryRepositoryPostgresql;
            case MYSQL -> this.categoryRepositoryMysql;
        };
    }

    @Bean("CategoryRepositoryImpl")
    CategoryRepositoryInterface selectCategoryRepositoryImpl() {
        return switch (currentDatabase){
            case MONGO -> this.categoryRepositoryMongoImpl;
            case MYSQL -> this.categoryRepositoryMysqlImpl;
            case POSTGRES -> this.categoryRepositoryPostgresqlImpl;
        };
    }
}