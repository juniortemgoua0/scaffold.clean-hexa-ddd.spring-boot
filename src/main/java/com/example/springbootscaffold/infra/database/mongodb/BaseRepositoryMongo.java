package com.example.springbootscaffold.infra.database.mongodb;

import com.example.springbootscaffold.core.ports.repository.IBaseRepository;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.repository.NoRepositoryBean;

/**
 * .
 */
@NoRepositoryBean
public interface BaseRepositoryMongo<E, I> extends IBaseRepository<E, I>, MongoRepository<E, I> {
}