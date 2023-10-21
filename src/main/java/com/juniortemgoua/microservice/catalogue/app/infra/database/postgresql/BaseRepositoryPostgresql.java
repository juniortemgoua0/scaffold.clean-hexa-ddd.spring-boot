package com.juniortemgoua.microservice.catalogue.app.infra.database.postgresql;

import com.juniortemgoua.microservice.catalogue.app.core.repository.IBaseRepository;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * .
 */
public interface BaseRepositoryPostgresql<E, I> extends IBaseRepository<E, I>,
    JpaRepository<E, I> {

}