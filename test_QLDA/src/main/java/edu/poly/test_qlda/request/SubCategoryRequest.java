package edu.poly.test_qlda.request;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class SubCategoryRequest {
    private String subCateCode;
    private String subCateName;
    private Long cateID;
}
