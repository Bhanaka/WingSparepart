package com.wings.sparepart.product.Entity;

import jakarta.persistence.*;
import lombok.*;

import java.util.Date;
@Entity
@Table(name = "ProductionSubCategoryEntity")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Data
public class ProductionSubCategoryEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
//    @Column(columnDefinition = "BIGSERIAL")
    private Long id;
    @Column
    private Integer SubCategoryId ;
    @Column
    private String subSubCategoryDes ;
    @Column
    private Boolean status ;
    @Column()
    private String date ;
//    @OneToOne
//    @JoinColumn(name ="categoryId")
//    private ProductionCategoryEntity productionCategoryEntity ;
    @ManyToOne
    @JoinColumn(name = "category_id")
    private ProductionCategoryEntity ProductionCategoryEntity;

}
