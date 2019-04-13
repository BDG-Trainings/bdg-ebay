package com.bdg.bdgebay.service.category;

import com.bdg.bdgebay.entity.Category;
import com.bdg.bdgebay.repository.category.CategoryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * @author William Arustamyan
 */


@Service
public class CategoryServiceImpl implements CategoryService {


    private CategoryRepository categoryRepository;

    @Transactional
    @Override
    public List<Category> allCategories() {
        return categoryRepository.findAll();
    }


    @Autowired
    public void setCategoryRepository(final CategoryRepository categoryRepository) {
        this.categoryRepository = categoryRepository;
    }
}
