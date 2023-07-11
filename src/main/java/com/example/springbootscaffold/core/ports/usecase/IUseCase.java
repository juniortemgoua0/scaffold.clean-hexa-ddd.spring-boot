package com.example.springbootscaffold.core.ports.usecase;

/**
 * .
 */
public interface IUseCase<I, O> {
   O execute(I requestDto);
   default void validate(I requestDto){};
}