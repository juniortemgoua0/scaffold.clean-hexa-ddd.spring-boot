package com.example.springbootscaffold.infra.database.mysql;

import com.example.springbootscaffold.core.ports.repository.IBaseRepository;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.NoRepositoryBean;

/**
 * .
 */
@NoRepositoryBean
public interface BaseRepositoryMysql<E, I> extends IBaseRepository<E, I>, JpaRepository<E, I> {
}