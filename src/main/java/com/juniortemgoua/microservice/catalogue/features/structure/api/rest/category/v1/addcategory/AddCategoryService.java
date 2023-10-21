package com.juniortemgoua.microservice.catalogue.features.structure.api.rest.category.v1.addcategory;

import com.juniortemgoua.microservice.catalogue.features.structure.domain.ports.primary.dto.category.addCategory.AddCategoryOutputDto;
import com.juniortemgoua.microservice.catalogue.features.structure.domain.ports.primary.dto.category.findCategories.FindCategoriesOutputDto;
import com.juniortemgoua.microservice.catalogue.features.structure.domain.ports.secondary.repositories.CategoryRepositoryInterface;
import com.juniortemgoua.microservice.catalogue.features.structure.domain.usecases.category.v1.AddCategoryUsecaseImpl;
import com.juniortemgoua.microservice.catalogue.features.structure.infra.entities.category.mappers.CategoryMapper;
import com.juniortemgoua.microservice.catalogue.features.structure.api.rest.category.v1.addcategory.dto.AddCategoryRequestDto;
import com.juniortemgoua.microservice.catalogue.features.structure.api.rest.category.v1.addcategory.dto.AddCategoryResponseDto;
import com.juniortemgoua.microservice.catalogue.app.core.broker.BrokerInterface;
import com.juniortemgoua.library.core.utilities.classes.MetaData;
import com.juniortemgoua.library.core.utilities.dto.ResponseDto;
import com.juniortemgoua.microservice.catalogue.app.infra.notification.fcm.FcmNotification;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import java.util.Map;


/**
 * .
 */
@Service
public class AddCategoryService {

    private final CategoryRepositoryInterface categoryRepository;
    private final BrokerInterface broker;
    private final CategoryMapper categoryMapper;

    @Autowired
    public AddCategoryService(
            @Qualifier("CategoryRepositoryImpl") CategoryRepositoryInterface categoryRepository,
            @Qualifier("Broker") BrokerInterface broker,
            CategoryMapper categoryMapper
    ) {
        this.categoryRepository = categoryRepository;
        this.broker = broker;
        this.categoryMapper = categoryMapper;
    }

    /**
     * .
     */
    public ResponseDto<AddCategoryResponseDto> addCategory(AddCategoryRequestDto requestDto) {

        AddCategoryUsecaseImpl addCategoryUsecase =
                new AddCategoryUsecaseImpl(categoryRepository, broker, new FcmNotification(),categoryMapper);

        AddCategoryOutputDto category = addCategoryUsecase.execute(requestDto.mapToInputDto(requestDto));

        FindCategoriesOutputDto getCategoriesOutputDto = new FindCategoriesOutputDto();

        return ResponseDto.<AddCategoryResponseDto>builder()
                .data(new AddCategoryResponseDto().mapFromOutputDto(category))
                .message("Category added successfully")
                .success(true)
                .meta(MetaData.builder()
                        .ressourceVersion("v1.0.1")
                        .apiVersion("v2")
                        .others(Map.of("userId", "6ehs72idfmdfkmamsa", "email", "juniortemgoua0@gamil.com"))
                        .build()
                )
                .build();
    }
}