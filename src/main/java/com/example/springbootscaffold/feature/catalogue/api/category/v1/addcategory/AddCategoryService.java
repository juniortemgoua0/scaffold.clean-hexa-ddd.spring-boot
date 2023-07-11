package com.example.springbootscaffold.feature.catalogue.api.category.v1.addcategory;

import com.example.springbootscaffold.feature.catalogue.api.category.v1.addcategory.dto.AddCategoryRequestDto;
import com.example.springbootscaffold.feature.catalogue.api.category.v1.addcategory.dto.AddCategoryResponseDto;
import com.example.springbootscaffold.feature.catalogue.domain.entities.Category;
import com.example.springbootscaffold.feature.catalogue.domain.ports.secondary.repositories.ICategoryRepository;
import com.example.springbootscaffold.feature.catalogue.domain.usecases.category.v1.AddCategoryUsecaseImpl;
import com.example.springbootscaffold.core.ports.broker.IBroker;
import com.example.springbootscaffold.feature.catalogue.domain.ports.primary.dto.category.addCategory.AddCategoryOutputDto;
import com.example.springbootscaffold.infra.notification.fcm.FcmNotification;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;


/**
 * .
 */
@Service
public class AddCategoryService {

    private final ICategoryRepository<Category, String> categoryRepository;
    private final IBroker broker;

    @Autowired
    public AddCategoryService(
            @Qualifier("CategoryRepository") ICategoryRepository<Category, String> categoryRepository,
            @Qualifier("Broker") IBroker broker) {
        this.categoryRepository = categoryRepository;
        this.broker = broker;
    }

    /**
     * .
     */
    public AddCategoryResponseDto addCategory(AddCategoryRequestDto requestDto) {
        AddCategoryUsecaseImpl addCategoryUsecase = new AddCategoryUsecaseImpl(categoryRepository, broker, new FcmNotification());
        AddCategoryOutputDto category = addCategoryUsecase.execute(new AddCategoryRequestDto().mapTo(requestDto));
        return new AddCategoryResponseDto().mapFrom(category);
    }
}