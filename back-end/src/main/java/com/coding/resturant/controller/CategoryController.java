package com.coding.resturant.controller;

import com.coding.resturant.model.Category;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import com.coding.resturant.service.CategoryService;

import java.util.List;

@RestController
@AllArgsConstructor
public class CategoryController {
    private final CategoryService categoryService;
    @GetMapping("/api/categories")
    public List<Category> getAllCategory() {
      return categoryService.allCategories();
    }
}
