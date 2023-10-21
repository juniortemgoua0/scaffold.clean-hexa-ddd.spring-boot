package com.juniortemgoua.microservice.catalogue.features.structure.infra.entities.category;

import com.juniortemgoua.microservice.catalogue.features.structure.domain.ports.secondary.entities.CategoryInterface;
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
public class CategoryEntityPostgresql implements CategoryInterface {
    private String title;
}