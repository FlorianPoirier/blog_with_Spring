package com.fpoirier.blog.services;

import com.fpoirier.blog.domain.entities.Category;

import java.util.List;
import java.util.UUID;

public interface CategoryService {
    List<Category> listCategories();
    Category createCategory(Category category);

    void deleteCategory(UUID id);
}
