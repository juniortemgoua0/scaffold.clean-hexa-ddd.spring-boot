package com.juniortemgoua.microservice.catalogue.features.structure.api.rest.category.v1.addcategory;

import com.juniortemgoua.microservice.catalogue.features.structure.api.rest.category.v1.addcategory.dto.AddCategoryRequestDto;
import com.juniortemgoua.microservice.catalogue.features.structure.api.rest.category.v1.addcategory.dto.AddCategoryResponseDto;
import com.juniortemgoua.library.core.utilities.dto.ResponseDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * .
 */
@RestController
@RequestMapping("api/v1/categories")
public class AddCategoryRestController {
    private final AddCategoryService addCategoryService;

    @Autowired
    public AddCategoryRestController(AddCategoryService addCategoryService) {
        this.addCategoryService = addCategoryService;
    }

    @PostMapping
    public ResponseEntity<ResponseDto<AddCategoryResponseDto>> addCategory(@RequestBody AddCategoryRequestDto requestDto) {
        ResponseDto<AddCategoryResponseDto> responseDto = this.addCategoryService.addCategory(requestDto);
        return ResponseEntity.status(responseDto.getStatus())
                .body(responseDto);
    }
}