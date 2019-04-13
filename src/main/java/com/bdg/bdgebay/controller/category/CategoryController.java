package com.bdg.bdgebay.controller.category;

import com.bdg.bdgebay.entity.Category;
import com.bdg.bdgebay.service.category.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @author William Arustamyan
 */

@RestController
public class CategoryController {

    private CategoryService categoryService;


    @RequestMapping(path = "/category/categories", method = RequestMethod.POST)
    public List<Category> categories() {
        return categoryService.allCategories();
    }


    @Autowired
    public void setCategoryService(final CategoryService categoryService) {
        this.categoryService = categoryService;
    }
}
