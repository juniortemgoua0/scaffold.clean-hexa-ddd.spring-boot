package com.juniortemgoua.microservice.catalogue.features.structure.domain.usecases.category.v1;

import com.juniortemgoua.microservice.catalogue.features.structure.domain.entities.Category;
import com.juniortemgoua.microservice.catalogue.features.structure.domain.ports.primary.dto.category.addCategory.AddCategoryInputDto;
import com.juniortemgoua.microservice.catalogue.features.structure.domain.ports.secondary.entities.CategoryInterface;
import com.juniortemgoua.microservice.catalogue.app.core.notification.INotification;
import com.juniortemgoua.microservice.catalogue.features.structure.domain.ports.secondary.repositories.CategoryRepositoryInterface;
import com.juniortemgoua.microservice.catalogue.app.core.broker.BrokerInterface;
import com.juniortemgoua.library.core.utilities.interfaces.UsecaseInterface;
import com.juniortemgoua.microservice.catalogue.features.structure.domain.ports.primary.dto.category.addCategory.AddCategoryOutputDto;
import com.juniortemgoua.library.core.utilities.interfaces.DbEntityMapper;
import lombok.RequiredArgsConstructor;

/**
 * .
 */
@RequiredArgsConstructor
public class AddCategoryUsecaseImpl implements UsecaseInterface<AddCategoryInputDto, AddCategoryOutputDto> {

    private final CategoryRepositoryInterface categoryRepository;
    private final BrokerInterface broker;
    private final INotification notification;
    private final DbEntityMapper<Category,CategoryInterface> categoryEntityMapper;

    @Override
    public AddCategoryOutputDto execute(AddCategoryInputDto requestDto) {

        this.validate(requestDto);

        // TODO: Suite du code

        return AddCategoryOutputDto.builder()
                .title(requestDto.getTitle())
                .description(requestDto.getDescription())
                .build();
    }

    @Override
    public void validate(AddCategoryInputDto requestDto) {
    }


}