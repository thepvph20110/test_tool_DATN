package edu.poly.test_qlda.dao;

import edu.poly.test_qlda.response.SubCategoryResponse;
import edu.poly.test_qlda.entity.SubCategoryEntity;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface ISubCategoryDAO extends JpaRepository<SubCategoryEntity, Long> {
        @Query("select new edu.poly.test_qlda.response.SubCategoryResponse(s.id , s.subCateCode , s.subCateName )from SubCategoryEntity s")
        List<SubCategoryResponse> findAllSubCate(Pageable pageable);
}
