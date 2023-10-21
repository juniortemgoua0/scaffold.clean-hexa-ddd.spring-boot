package com.juniortemgoua.microservice.catalogue.app.infra.database.mongodb;

import com.juniortemgoua.microservice.catalogue.app.core.repository.IBaseRepository;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.repository.NoRepositoryBean;

/**
 * .
 */
@NoRepositoryBean
public interface BaseRepositoryMongo<E, I> extends IBaseRepository<E, I>, MongoRepository<E, I> {

}