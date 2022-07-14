package edu.poly.test_qlda.dao;

import edu.poly.test_qlda.entity.BrandEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IBrandDAO extends JpaRepository<BrandEntity, Long> {
}
