package com.juniortemgoua.microservice.catalogue.features.structure.infra.entities.category;

import com.juniortemgoua.microservice.catalogue.features.structure.domain.ports.secondary.entities.CategoryInterface;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.mongodb.core.mapping.Document;

/**
 * .
 */
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Data
@Document
public class CategoryEntityMongo implements CategoryInterface {
  private String title;
}