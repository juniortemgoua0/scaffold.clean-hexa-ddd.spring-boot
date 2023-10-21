package com.juniortemgoua.microservice.catalogue.features.structure.domain.ports.secondary.repositories;

/**
 * .
 */
public interface CategoryRepositoryInterface {
    <O, I> O getAll(I input);
}