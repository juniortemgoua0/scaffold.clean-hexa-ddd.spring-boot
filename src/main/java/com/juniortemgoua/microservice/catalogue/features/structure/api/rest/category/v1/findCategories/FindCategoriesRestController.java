package com.juniortemgoua.microservice.catalogue.features.structure.api.rest.category.v1.findCategories;

import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/v1/category")
@RequiredArgsConstructor
public class FindCategoriesRestController {

    @Autowired
    private final FindCategoriesService findCategoriesService;


}
