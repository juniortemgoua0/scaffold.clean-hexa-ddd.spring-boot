package com.juniortemgoua.microservice.catalogue.features.structure.domain.ports.primary.dto.category.addCategory;

import lombok.Builder;
import lombok.Data;

/**.
 * */

@Data
@Builder
public class AddCategoryInputDto {
   private String title;
   private String description;
}