package com.juniortemgoua.microservice.catalogue.features.structure.api.rest.category.v1.addcategory.dto;

import com.juniortemgoua.microservice.catalogue.features.structure.domain.ports.primary.dto.category.addCategory.AddCategoryInputDto;
import com.juniortemgoua.library.core.utilities.interfaces.DtoRequestMapper;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * .
 */
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Data
public class AddCategoryRequestDto
        implements DtoRequestMapper<AddCategoryInputDto, AddCategoryRequestDto> {

    private String title;
    private String description;


    @Override
    public AddCategoryRequestDto mapFromInputDto(AddCategoryInputDto inputDto) {
        return null;
    }

    @Override
    public AddCategoryInputDto mapToInputDto(AddCategoryRequestDto requestDto) {
        return AddCategoryInputDto.builder()
                .title(this.title)
                .description(this.description)
                .build();
    }
}
