package com.juniortemgoua.library.core.utilities.dto;

import com.juniortemgoua.library.core.utilities.classes.MetaData;
import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class ResponseDto<T> {
    private String message;
    private boolean success;
    private boolean error;
    private int status;
    private T data;
    private MetaData meta;
}
