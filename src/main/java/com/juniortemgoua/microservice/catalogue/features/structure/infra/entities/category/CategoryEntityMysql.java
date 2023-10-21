package com.juniortemgoua.microservice.catalogue.features.structure.infra.entities.category;

import com.juniortemgoua.microservice.catalogue.features.structure.domain.ports.secondary.entities.CategoryInterface;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;

/**
 * .
 */
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Data
@Entity
public class CategoryEntityMysql implements CategoryInterface {
    private String title;
}