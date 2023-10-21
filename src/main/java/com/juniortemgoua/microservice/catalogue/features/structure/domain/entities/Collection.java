package com.juniortemgoua.microservice.catalogue.features.structure.domain.entities;

import com.juniortemgoua.microservice.catalogue.features.structure.domain.ports.secondary.entities.CollectionInterface;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

/**
 * .
 */
@AllArgsConstructor
@Builder
@Data
public class Collection implements CollectionInterface {
    private String title;
}