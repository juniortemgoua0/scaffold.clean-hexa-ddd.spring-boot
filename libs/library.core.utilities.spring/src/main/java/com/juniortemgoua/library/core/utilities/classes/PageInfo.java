package com.juniortemgoua.library.core.utilities.classes;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class PageInfo {
    private int pageSize;
    private int pageIndex;
    private int totalPages;
    private int totalItems;
    private boolean hasNext;
    private boolean hasPrevious;
    private int offset;
}