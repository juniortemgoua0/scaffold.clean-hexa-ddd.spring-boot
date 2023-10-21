package com.juniortemgoua.microservice.catalogue.features.structure.api.rest.category.v1.addcategory.dto;

import com.juniortemgoua.library.core.utilities.interfaces.DtoResponseMapper;
import com.juniortemgoua.microservice.catalogue.features.structure.domain.ports.primary.dto.category.addCategory.AddCategoryOutputDto;
import lombok.*;

/**
 * .
 */
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Data
public class AddCategoryResponseDto
        implements DtoResponseMapper<AddCategoryOutputDto, AddCategoryResponseDto> {

  private String description;
  private String title;

  @Override
  public  AddCategoryResponseDto mapFromOutputDto(AddCategoryOutputDto outputDto){
    return AddCategoryResponseDto.builder()
            .title(outputDto.getTitle())
            .description(outputDto.getDescription())
            .build();
  }

  @Override
  public AddCategoryOutputDto mapToOutputDto(AddCategoryResponseDto responseDto) {
    return AddCategoryOutputDto.builder()
            .title(responseDto.getTitle())
            .description(responseDto.getDescription())
            .build();
  }
}