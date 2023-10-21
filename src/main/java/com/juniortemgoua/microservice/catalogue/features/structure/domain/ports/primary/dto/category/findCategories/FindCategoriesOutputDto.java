package com.juniortemgoua.microservice.catalogue.features.structure.domain.ports.primary.dto.category.findCategories;

import lombok.Builder;
import lombok.Data;

import java.util.ArrayList;

public class FindCategoriesOutputDto extends ArrayList<FindCategoriesOutputDto.CategoryOutputDto> {

    @Builder
    @Data
    public static class CategoryOutputDto {
        private String title;
    }
}
