package com.example.springbootscaffold.feature.catalogue.api.category.v1.addcategory.dto;

import com.example.springbootscaffold.core.utils.interfaces.Mapper;
import com.example.springbootscaffold.feature.catalogue.domain.ports.primary.dto.category.addCategory.AddCategoryInputDto;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * .
 */
@Builder(setterPrefix = "set")
@NoArgsConstructor
@AllArgsConstructor
@Data
public class AddCategoryRequestDto implements Mapper<AddCategoryInputDto, AddCategoryRequestDto> {

    private String title;
    private String description;

    @Override
    public AddCategoryInputDto mapTo(AddCategoryRequestDto requestDto) {
        return AddCategoryInputDto.builder()
                .setTitle(requestDto.title)
                .setDescription(requestDto.description)
                .build();
    }

    @Override
    public AddCategoryRequestDto mapFrom(AddCategoryInputDto inputDto) {
        return AddCategoryRequestDto.builder()
                .setTitle(inputDto.getTitle())
                .setDescription(inputDto.getDescription())
                .build();
    }
}
