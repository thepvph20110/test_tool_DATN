package edu.poly.test_qlda.service;

import edu.poly.test_qlda.response.ProductResponse;
import edu.poly.test_qlda.request.ProductRequest;
import org.springframework.data.domain.Pageable;

import java.util.List;

public interface IProductService {
    String createProduct(ProductRequest request , Long id);
    String deleteProduct(Long id);
    List<ProductResponse> findAllProduct(Pageable pageable);
}
