package com.example.productapi2.service.impl;

import com.example.productapi2.dto.CategoryDto;
//import com.example.productapi2.dto.CompanyDto;
import com.example.productapi2.entity.Category;
import com.example.productapi2.mapper.CategoryMapper;
import com.example.productapi2.repository.CategoryRepository;
import com.example.productapi2.service.CategoryService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Component;

import java.util.List;
@Component
@AllArgsConstructor
public class CategoryImpl implements CategoryService {

    private final CategoryRepository categoryRepository;
    private final CategoryMapper categoryMapper;
    @Override
    public List<CategoryDto> getAll() {
        return categoryRepository.findAll().stream().map(categoryMapper::toCategoryDto).toList();
    }

    @Override
    public List<CategoryDto> getAllByItem(String item) {
        return categoryRepository.findAllByItem(item).stream().map(categoryMapper::toCategoryDto).toList();
    }

    @Override
    public CategoryDto getCategoryById(int id) {
        return categoryRepository.findById(id).stream().map(categoryMapper::toCategoryDto).findFirst().get();
    }

    @Override
    public void addCategory(CategoryDto categoryDto) {

        Category category=new Category();
        category.setName(categoryDto.getName());
        category.setItem(categoryDto.getItem());
        category.setStatus(categoryDto.getStatus());
        categoryRepository.save(category);

    }

    @Override
    public void deleteCategory(int id) {

        categoryRepository.deleteById(id);

    }
}
