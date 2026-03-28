package com.coding.resturant.service;

import com.coding.resturant.model.Category;
import com.coding.resturant.repository.CategoryRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class CategoryService {
    private final CategoryRepository categoryRepository;

    public List<Category> allCategories() {
      return categoryRepository.findAll();
    }
}
