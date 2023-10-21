package com.juniortemgoua.microservice.catalogue.features.structure.infra.entities.collection;

import com.juniortemgoua.microservice.catalogue.features.structure.domain.ports.secondary.entities.CollectionInterface;
import lombok.Builder;
import lombok.Data;

/**
 * .
 */
@Builder
@Data
public class CollectionEntityMongo implements CollectionInterface {
  private String title;

}