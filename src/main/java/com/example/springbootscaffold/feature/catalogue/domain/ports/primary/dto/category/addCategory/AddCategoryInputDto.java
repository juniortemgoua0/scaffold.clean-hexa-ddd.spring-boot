package com.example.springbootscaffold.feature.catalogue.domain.ports.primary.dto.category.addCategory;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**.
 * */
@Builder(setterPrefix = "set")
@AllArgsConstructor @Data
public class AddCategoryInputDto {
  private String title;
  private String description;
}