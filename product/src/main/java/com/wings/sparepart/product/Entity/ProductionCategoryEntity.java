package com.wings.sparepart.product.Entity;

import jakarta.persistence.*;
import lombok.*;

import java.util.Date;
import java.util.List;
import java.util.Set;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Data
@ToString
@Table(name ="ProductionCategory")
public class ProductionCategoryEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
//    @Column(columnDefinition = "BIGSERIAL")
    private Long id;
    @Column
    private Integer categoryId ;
    @Column
    private String categoryDescription ;
    @Column
    private Integer subCategoryId ;
    @Column
    private Boolean status;
    @Column()
    private String date ;
    //    @Column
//    @OneToOne
//    @JoinColumn(name = "production_sub_category_sub_category_id")
//    private ProductionSubCategoryEntity productionSubCategoryEntity ;
//    @OneToMany(mappedBy = "ProductionCategoryEntity", cascade = CascadeType.ALL, orphanRemoval = true)
//    private List<ProductionSubCategoryEntity> subcategories;
    @OneToMany()
    private List<ProductionSubCategoryEntity> subcategories;
}
