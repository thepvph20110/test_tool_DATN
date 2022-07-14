package edu.poly.test_qlda.request;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class ProductRequest {
    private Long subcateId;
    private String produceName;
    private String coler ;
    private int quantity;
    private double sellPDrice ;
    private double originPrice ;
    private String description;
    private Long statusId;
    private List<Long> brandId;
}
