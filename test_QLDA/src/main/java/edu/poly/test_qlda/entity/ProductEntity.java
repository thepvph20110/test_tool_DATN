package edu.poly.test_qlda.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "product")
public class ProductEntity implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id ;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "subcate_id")
    private SubCategoryEntity subCateId ;

    @Column(name = "produce_name")
    private String productName;

    private String color;
    private int quantity;

    @Column(name = "sell_price")
    private double sellPrice;
    @Column(name = "origin_price")
    private double originPrice;
    private String description;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "status_id")
    private StatusEntity statusId ;

    @ManyToMany(fetch = FetchType.LAZY)
    @JoinTable(name = "product_brand",
            joinColumns = @JoinColumn(name = "product_id"),
            inverseJoinColumns = @JoinColumn(name = "brand_id")
    )
    private List<BrandEntity> brands;

}
