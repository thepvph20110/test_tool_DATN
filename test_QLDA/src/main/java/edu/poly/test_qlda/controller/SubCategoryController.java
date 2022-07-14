package edu.poly.test_qlda.controller;


import edu.poly.test_qlda.response.SubCategoryResponse;
import edu.poly.test_qlda.request.SubCategoryRequest;
import edu.poly.test_qlda.service.ISubCategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/subcate")
public class SubCategoryController {
    @Autowired
    private ISubCategoryService iSubCategoryService;

    @GetMapping
    public List<SubCategoryResponse> findAllSubCate(@RequestParam("page") int page){
        return iSubCategoryService.findAllSubCate(page);
    }

    @PostMapping
    public ResponseEntity<String> creatSubCate(@RequestBody SubCategoryRequest dto){
        String error = iSubCategoryService.saveSubCategory(dto , null);
        return  new ResponseEntity<>(error, HttpStatus.CREATED);
    }

    @PutMapping(value = "/{id}")
    public ResponseEntity<String> updateSubCate(@RequestBody SubCategoryRequest dto ,
                                                @PathVariable("id") Long id){
        String error = iSubCategoryService.saveSubCategory(dto , id);
        return  new ResponseEntity<>(error, HttpStatus.CREATED);
    }

}
