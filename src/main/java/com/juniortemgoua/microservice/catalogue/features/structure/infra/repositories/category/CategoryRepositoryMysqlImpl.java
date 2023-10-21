package com.juniortemgoua.microservice.catalogue.features.structure.infra.repositories.category;

import com.juniortemgoua.microservice.catalogue.features.structure.domain.ports.secondary.repositories.CategoryRepositoryInterface;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;

@Service
public class CategoryRepositoryMysqlImpl implements CategoryRepositoryInterface {

    private final CategoryRepositoryMysql categoryRepository;

    @Autowired
    public CategoryRepositoryMysqlImpl(CategoryRepositoryMysql categoryRepository) {
        this.categoryRepository = categoryRepository;
    }

    public <O, I> O getAll(I input) {
        categoryRepository.<Page<String>, PageRequest>getAll(PageRequest.of(1,3));
        return null;
    }
}
