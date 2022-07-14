package edu.poly.test_qlda.response;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class ProductResponse {
    private Long productID;
    private String subCateName;
    private String productName;
    private String color;
    private int quantity;
    private double sellPrice;
    private  double originPrice;
    private String statusName;
    private String brandName ;

}
