package com.example.springbootscaffold.feature.catalogue.domain.ports.primary.dto.category.addCategory;


import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

/**
 * .
 */
@Builder(setterPrefix = "set")
@Data @AllArgsConstructor
public class AddCategoryOutputDto {
  private String title;
  private String description;
}
