package com.juniortemgoua.library.core.utilities.interfaces;

/**
 * @param <I> : Entity interface
 * @param <T> : Entity domain
 **/
public interface DbEntityMapper<T,I> {
    I mapToInfraEntity(T domainEntity);
    T mapToDomainEntity(I infraEntity);
}
