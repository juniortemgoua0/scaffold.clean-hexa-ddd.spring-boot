package com.juniortemgoua.microservice.catalogue.features.structure.domain.ports.primary.dto.category.addCategory;


import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

/**
 * .
 */
@Builder
@Data @AllArgsConstructor
public class AddCategoryOutputDto {
   String title;
   String description;
}
