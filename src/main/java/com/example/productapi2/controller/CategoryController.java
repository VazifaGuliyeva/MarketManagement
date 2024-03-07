package com.example.productapi2.controller;

import com.example.productapi2.dto.CategoryDto;
import com.example.productapi2.service.impl.CategoryImpl;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/categories")
@AllArgsConstructor
public class CategoryController {

    private final CategoryImpl categoryImpl;

   @GetMapping
    public List<CategoryDto> getAll() {
        return categoryImpl.getAll();
    }

    @GetMapping("/{id}")
    public CategoryDto getCategoryById(@PathVariable int id) {
        return categoryImpl.getCategoryById(id);
    }

    @PostMapping
    public void addCategory(@RequestBody CategoryDto categoryDto) {

        categoryImpl.addCategory(categoryDto);

    }

    @DeleteMapping("/{id}")
    public void deleteCategory(@PathVariable int id) {

        categoryImpl.deleteCategory(id);

    }
    @GetMapping("item/{item}")
    public List<CategoryDto> getAllByItem(@PathVariable String item){
     return   categoryImpl.getAllByItem(item);
    }
}
