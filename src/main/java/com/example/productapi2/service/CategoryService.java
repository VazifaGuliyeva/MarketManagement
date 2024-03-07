package com.example.productapi2.service;

import com.example.productapi2.dto.CategoryDto;

import java.util.List;

public interface CategoryService {

    List<CategoryDto> getAll();

    List<CategoryDto> getAllByItem(String item);

    CategoryDto getCategoryById(int id);

    void addCategory(CategoryDto category);

    void deleteCategory(int id);
}
