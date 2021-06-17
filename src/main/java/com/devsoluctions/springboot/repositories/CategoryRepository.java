package com.devsoluctions.springboot.repositories;

import com.devsoluctions.springboot.entitites.Category;
import com.devsoluctions.springboot.entitites.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CategoryRepository extends JpaRepository<Category, Long> {
}
