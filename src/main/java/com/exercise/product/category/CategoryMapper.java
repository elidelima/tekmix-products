package com.exercise.product.category;

import org.springframework.stereotype.Component;

@Component
public class CategoryMapper {
    public CategoryDTO toDto(Category category) {
        CategoryDTO dto = new CategoryDTO();
        dto.setId(category.getId());
        dto.setName(category.getName());
        dto.setDescription(category.getDescription());
        return dto;
    }

    public Category toCategory(CategoryCreationDTO dto) {
        Category category = new Category();
        category.setName(dto.getName());
        category.setDescription(dto.getDescription());
        return category;
    }
}
