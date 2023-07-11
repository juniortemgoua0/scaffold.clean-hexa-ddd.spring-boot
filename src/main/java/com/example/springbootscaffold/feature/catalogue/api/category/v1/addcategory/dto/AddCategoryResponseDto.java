package com.example.springbootscaffold.feature.catalogue.api.category.v1.addcategory.dto;

import com.example.springbootscaffold.core.utils.interfaces.Mapper;
import com.example.springbootscaffold.feature.catalogue.domain.ports.primary.dto.category.addCategory.AddCategoryOutputDto;
import lombok.*;

/**
 * .
 */
@Builder(setterPrefix = "set")
@AllArgsConstructor
@NoArgsConstructor
@Data
public class AddCategoryResponseDto implements Mapper<AddCategoryOutputDto, AddCategoryResponseDto> {

  private String description;
  private String title;

  @Override
  public  AddCategoryResponseDto mapFrom(AddCategoryOutputDto outputDto){
    return AddCategoryResponseDto.builder()
            .setTitle(outputDto.getTitle())
            .setDescription(outputDto.getDescription())
            .build();
  }

  @Override
  public AddCategoryOutputDto mapTo(AddCategoryResponseDto responseDto) {
    return AddCategoryOutputDto.builder()
            .setTitle(responseDto.getTitle())
            .setDescription(responseDto.getDescription())
            .build();
  }
}
