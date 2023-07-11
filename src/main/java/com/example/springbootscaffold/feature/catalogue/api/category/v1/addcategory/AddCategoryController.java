package com.example.springbootscaffold.feature.catalogue.api.category.v1.addcategory;


import com.example.springbootscaffold.feature.catalogue.api.category.v1.addcategory.dto.AddCategoryRequestDto;
import com.example.springbootscaffold.feature.catalogue.api.category.v1.addcategory.dto.AddCategoryResponseDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * .
 */
@RestController
@RequestMapping("api/v1/categories")
public class AddCategoryController {

    private final AddCategoryService addCategoryService;

    @Autowired
    public AddCategoryController(AddCategoryService addCategoryService) {
        this.addCategoryService = addCategoryService;
    }

    @PostMapping
    public AddCategoryResponseDto addCategory(@RequestBody AddCategoryRequestDto requestDto) {
        return this.addCategoryService.addCategory(requestDto);
    }
}