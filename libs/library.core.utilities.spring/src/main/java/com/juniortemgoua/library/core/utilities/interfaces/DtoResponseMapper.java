package com.juniortemgoua.library.core.utilities.interfaces;

/**
 * .
 */
public interface DtoResponseMapper<O, R> {
    R mapFromOutputDto(O outputDto);

    default O mapToOutputDto(R responseDto) {
        return null;
    }
}