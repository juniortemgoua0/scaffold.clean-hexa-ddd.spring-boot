package com.juniortemgoua.library.core.utilities.dto;

import com.juniortemgoua.library.core.utilities.classes.PageInfo;
import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class PaginationResponse<T> {
    private T items;
    private PageInfo page;
}

