package com.example.springbootscaffold.infra.database.postgresql;

import com.example.springbootscaffold.core.ports.repository.IBaseRepository;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * .
 */
public interface BaseRepositoryPostgresql<E, I> extends IBaseRepository<E, I>,
    JpaRepository<E, I> {

}