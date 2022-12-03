package org.dataaccess.repositories;

import org.dataaccess.Shared.Category;
import org.dataaccess.Shared.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface CategoryRepository extends JpaRepository<Category, Long>
{
    @Query("SELECT c FROM Category c WHERE c.category_name = ?1")
    Category findCategory(String categoryName);
}
