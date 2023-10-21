package com.juniortemgoua.microservice.catalogue.features.structure.api.rest.category.v1.findCategories.dto;

import com.juniortemgoua.library.core.utilities.interfaces.DtoResponseMapper;
import com.juniortemgoua.microservice.catalogue.features.structure.domain.ports.primary.dto.category.findCategories.FindCategoriesOutputDto;
import lombok.Builder;
import lombok.Data;

import java.util.ArrayList;

public class FindCategoriesResponseDto
        extends ArrayList<FindCategoriesResponseDto.CategoryResponseDto>
        implements DtoResponseMapper<FindCategoriesOutputDto, FindCategoriesResponseDto> {

    @Override
    public FindCategoriesResponseDto mapFromOutputDto(FindCategoriesOutputDto outputDto) {
        return outputDto.stream()
                .map(c -> CategoryResponseDto.builder()
                        .title(c.getTitle())
                        .build()
                )
                .collect(FindCategoriesResponseDto::new,
                        FindCategoriesResponseDto::add,
                        FindCategoriesResponseDto::addAll);
    }

    @Builder
    @Data
    public static class CategoryResponseDto {
        private String title;
    }
}