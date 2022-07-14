package edu.poly.test_qlda.controller;

import edu.poly.test_qlda.response.ProductResponse;
import edu.poly.test_qlda.request.ProductRequest;
import edu.poly.test_qlda.service.IProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/product")
public class ProductController {
    @Autowired
    private IProductService productService;

    @GetMapping
    public List<ProductResponse> finAllProduct(@RequestParam("page") int page){
        Pageable pageable = PageRequest.of(page-1,5);
        return productService.findAllProduct(pageable);
    }

    @PostMapping
    public ResponseEntity<String> createProduct(@RequestBody ProductRequest request){
        String erro= productService.createProduct(request,null);
        return new ResponseEntity<>(erro, HttpStatus.CREATED);
    }

    @PutMapping("/{id}")
    public ResponseEntity<String> updateProduct(@RequestBody ProductRequest request , @PathVariable("id") Long id){
        String erro= productService.createProduct(request,id);
        return new ResponseEntity<>(erro, HttpStatus.CREATED);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<String> deleteProduct(@PathVariable("id") Long id){
        String erro = productService.deleteProduct(id);
        return new ResponseEntity<>(erro , HttpStatus.OK);
    }
}
