package edu.poly.test_qlda.service;

import edu.poly.test_qlda.response.SubCategoryResponse;
import edu.poly.test_qlda.request.SubCategoryRequest;

import java.util.List;


public interface ISubCategoryService {
    String saveSubCategory(SubCategoryRequest dto, Long id);
    List<SubCategoryResponse> findAllSubCate(int page);
}
