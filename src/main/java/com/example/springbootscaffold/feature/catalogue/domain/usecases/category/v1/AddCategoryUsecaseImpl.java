package com.example.springbootscaffold.feature.catalogue.domain.usecases.category.v1;

import com.example.springbootscaffold.core.ports.notification.INotification;
import com.example.springbootscaffold.feature.catalogue.domain.entities.Category;
import com.example.springbootscaffold.feature.catalogue.domain.ports.secondary.repositories.ICategoryRepository;
import com.example.springbootscaffold.core.ports.broker.IBroker;
import com.example.springbootscaffold.core.ports.usecase.IUseCase;
import com.example.springbootscaffold.feature.catalogue.domain.ports.primary.dto.category.addCategory.AddCategoryInputDto;
import com.example.springbootscaffold.feature.catalogue.domain.ports.primary.dto.category.addCategory.AddCategoryOutputDto;
import lombok.AllArgsConstructor;

/**
 * .
 */
@AllArgsConstructor
public class AddCategoryUsecaseImpl implements IUseCase<AddCategoryInputDto, AddCategoryOutputDto> {

    private final ICategoryRepository<Category, String> categoryRepository;
    private final IBroker broker;
    private final INotification notification;

    @Override
    public AddCategoryOutputDto execute(AddCategoryInputDto requestDto) {

        this.validate(requestDto);

        // TODO: Suite du code

        return AddCategoryOutputDto.builder()
                .setTitle(requestDto.getTitle())
                .setDescription(requestDto.getDescription())
                .build();
    }

    @Override
    public void validate(AddCategoryInputDto requestDto) {

    }
}