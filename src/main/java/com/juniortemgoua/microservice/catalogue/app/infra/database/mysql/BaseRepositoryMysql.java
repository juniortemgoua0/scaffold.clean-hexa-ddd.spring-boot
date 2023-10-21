package com.juniortemgoua.microservice.catalogue.app.infra.database.mysql;

import com.juniortemgoua.microservice.catalogue.app.core.repository.IBaseRepository;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.NoRepositoryBean;

/**
 * .
 */
@NoRepositoryBean
public interface BaseRepositoryMysql<E, I> extends IBaseRepository<E, I>, JpaRepository<E, I> {
}