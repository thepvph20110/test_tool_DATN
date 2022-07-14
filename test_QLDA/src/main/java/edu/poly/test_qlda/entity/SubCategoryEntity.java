package edu.poly.test_qlda.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "sub_category")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class SubCategoryEntity implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;
    @Column(name = "sub_cate_code")
    private String subCateCode;

    @Column(name = "sub_cate_name")
    private String subCateName;

    @ManyToOne
    @JoinColumn(name = "cate_id")
    private CategoryEntity cateID;
}
