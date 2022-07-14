package edu.poly.test_qlda.dao;

import edu.poly.test_qlda.entity.StatusEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IStatusDAO extends JpaRepository<StatusEntity , Long> {
}
