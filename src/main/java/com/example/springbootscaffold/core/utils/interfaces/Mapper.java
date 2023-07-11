package com.example.springbootscaffold.core.utils.interfaces;

/**
 * .
 */
public interface Mapper<I, O> {
    O mapFrom(I entity);

    default I mapTo(O entity) {
        return null;
    }
}