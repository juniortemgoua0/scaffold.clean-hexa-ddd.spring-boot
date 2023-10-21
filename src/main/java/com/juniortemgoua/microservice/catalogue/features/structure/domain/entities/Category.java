package com.juniortemgoua.microservice.catalogue.features.structure.domain.entities;

import com.juniortemgoua.microservice.catalogue.features.structure.domain.ports.secondary.entities.CategoryInterface;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * .
 */
@NoArgsConstructor
@AllArgsConstructor
@Data
@Builder
public class Category implements CategoryInterface {
  private String title;
}