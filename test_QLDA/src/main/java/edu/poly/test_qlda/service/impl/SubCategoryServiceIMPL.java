package edu.poly.test_qlda.service.impl;

import edu.poly.test_qlda.response.SubCategoryResponse;
import edu.poly.test_qlda.converter.SubCategoryConver;
import edu.poly.test_qlda.request.SubCategoryRequest;
import edu.poly.test_qlda.entity.CategoryEntity;
import edu.poly.test_qlda.entity.SubCategoryEntity;
import edu.poly.test_qlda.dao.ICategoryDAO;
import edu.poly.test_qlda.dao.ISubCategoryDAO;
import edu.poly.test_qlda.service.ISubCategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class SubCategoryServiceIMPL implements ISubCategoryService {

    @Autowired
    private ISubCategoryDAO subCategoryRepository;
    @Autowired
    private ICategoryDAO categoryRepository;

    @Autowired
    private SubCategoryConver subCategoryConver;


    @Override
    public String saveSubCategory(SubCategoryRequest dto, Long id) {
        String erro = "";
        if (dto.getSubCateName().isEmpty() && dto.getSubCateCode().isEmpty() && dto.getCateID() == null) {
            return "không để trống thông tin";
        } else {
            boolean check = true;
            if (dto.getSubCateName().isEmpty()) {

                new ResponseEntity<String>("không để trống tên", HttpStatus.NOT_FOUND);
                check = false;
                erro += "không để trống tên\n";

            } else if (dto.getSubCateName().matches("\\d+")) {
                new ResponseEntity<String>("tên phải là chữ", HttpStatus.NOT_FOUND);
                check = false;
                erro += "tên phải là chữ\n";

            }
            if (dto.getSubCateCode().isEmpty()) {
                new ResponseEntity<String>("không để trống code", HttpStatus.NOT_FOUND);
                check = false;
                erro += "không để trống code\n";

            } else if (!dto.getSubCateCode().matches("SA+\\d{4}")) {
                new ResponseEntity<String>("code không đúng định dạng format (SA+4 số)", HttpStatus.NOT_FOUND);
                check = false;
                erro += "code không đúng định dạng format (SA+4 số)\n";

            }
            if (String.valueOf(dto.getCateID()).isEmpty()) {
                new ResponseEntity<String>("không để trống CateId", HttpStatus.NOT_FOUND);
                check = false;
                erro += "không để trống CateId\n";

            }
            if (check == true) {
                SubCategoryEntity entity;
                if(id == null){
                    entity= subCategoryConver.converSubCategoryToEntity(dto);
                    erro += "Lưu thành công";
                }else {
                    Optional<SubCategoryEntity>  oldEntity = subCategoryRepository.findById(id);
                    entity = subCategoryConver.converSubCategoryToEntity(dto, oldEntity.get());
                    erro += "Update thành công";
                }
                Optional<CategoryEntity> categoryEntity = categoryRepository.findById(dto.getCateID());
                entity.setCateID(categoryEntity.get());
                subCategoryRepository.save(entity);
            }
            return erro;
        }
    }

    @Override
    public List<SubCategoryResponse> findAllSubCate(int page) {
        Pageable pageable = PageRequest.of(page-1,5);
        List<SubCategoryResponse> list = subCategoryRepository.findAllSubCate(pageable);
        return list;
    }
}
