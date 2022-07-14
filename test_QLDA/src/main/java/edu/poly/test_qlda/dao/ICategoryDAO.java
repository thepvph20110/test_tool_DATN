package edu.poly.test_qlda.dao;

import edu.poly.test_qlda.entity.CategoryEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ICategoryDAO extends JpaRepository<CategoryEntity , Long>{
}
