package edu.poly.test_qlda.converter;

import edu.poly.test_qlda.entity.ProductEntity;
import edu.poly.test_qlda.request.ProductRequest;
import org.springframework.stereotype.Component;

@Component
public class ProductConver {
    public ProductEntity ConverProductDTOToEntity(ProductRequest request){
        ProductEntity entity = new ProductEntity();
        entity.setProductName(request.getProduceName());
        entity.setColor(request.getColer());
        entity.setQuantity(request.getQuantity());
        entity.setSellPrice(request.getSellPDrice());
        entity.setOriginPrice(request.getOriginPrice());
        entity.setDescription(request.getDescription());
        return entity;
    }

    public ProductEntity ConverProductDTOToEntity( ProductEntity entity,ProductRequest request){
        entity.setProductName(request.getProduceName());
        entity.setColor(request.getColer());
        entity.setQuantity(request.getQuantity());
        entity.setSellPrice(request.getSellPDrice());
        entity.setOriginPrice(request.getOriginPrice());
        entity.setDescription(request.getDescription());
        return entity;
    }
}
