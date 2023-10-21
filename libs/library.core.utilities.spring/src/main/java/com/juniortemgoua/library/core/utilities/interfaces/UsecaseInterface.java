package com.juniortemgoua.library.core.utilities.interfaces;

/**
 * .
 */
public interface UsecaseInterface<I, O> {
   O execute(I requestDto);
   default void validate(I requestDto){};
}