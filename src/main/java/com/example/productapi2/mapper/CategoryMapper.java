package com.example.productapi2.mapper;

import com.example.productapi2.dto.CategoryDto;
import com.example.productapi2.entity.Category;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface CategoryMapper {

  CategoryDto toCategoryDto(Category category);

  Category toCategory(CategoryDto categoryDto);
}
