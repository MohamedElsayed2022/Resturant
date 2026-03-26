package controller;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RestController;
import service.CategoryService;

@RestController
@AllArgsConstructor
@NoArgsConstructor
public class CategoryController {
    @Autowired
    private CategoryService categoryService;
}
