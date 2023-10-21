package com.juniortemgoua.microservice.catalogue.features.structure.infra.repositories.category;

import com.juniortemgoua.microservice.catalogue.features.structure.domain.ports.secondary.repositories.CategoryRepositoryInterface;
import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class CategoryRepositoryMongoImpl implements CategoryRepositoryInterface {

    private final CategoryRepositoryMongo categoryRepository;
    private final MongoTemplate mongoTemplate;

    /**
     * @implSpec
     *        { public Pagination getAll(Map<String,Integer> input); }
     * @return Pagination
     */
    public <O, I> O getAll(I input) {
        categoryRepository.<Page<String>, PageRequest>getAll(PageRequest.of(1, 3));
        return null;
    }
}
