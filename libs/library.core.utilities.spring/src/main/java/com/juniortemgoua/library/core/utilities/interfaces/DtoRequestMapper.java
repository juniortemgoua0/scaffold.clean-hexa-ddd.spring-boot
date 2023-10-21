package com.juniortemgoua.library.core.utilities.interfaces;

public interface DtoRequestMapper<I, R> {
    R mapFromInputDto(I inputDto);
    I mapToInputDto(R requestDto);
}
