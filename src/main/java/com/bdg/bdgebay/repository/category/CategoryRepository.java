package com.bdg.bdgebay.repository.category;

import com.bdg.bdgebay.entity.Category;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @author William Arustamyan
 */

public interface CategoryRepository extends JpaRepository<Category, Long> {
}
