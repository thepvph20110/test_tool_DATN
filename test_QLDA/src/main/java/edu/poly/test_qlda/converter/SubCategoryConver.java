package edu.poly.test_qlda.converter;

import edu.poly.test_qlda.request.SubCategoryRequest;
import edu.poly.test_qlda.entity.SubCategoryEntity;
import org.springframework.stereotype.Component;

@Component
public class SubCategoryConver {
    public SubCategoryEntity converSubCategoryToEntity(SubCategoryRequest dto){
        SubCategoryEntity entity = new SubCategoryEntity();
        entity.setSubCateName(dto.getSubCateName());
        entity.setSubCateCode(dto.getSubCateCode());
        return entity;
    }
    public SubCategoryEntity converSubCategoryToEntity(SubCategoryRequest dto , SubCategoryEntity entity ){
        entity.setSubCateName(dto.getSubCateName());
        entity.setSubCateCode(dto.getSubCateCode());
        return entity;
    }

}
