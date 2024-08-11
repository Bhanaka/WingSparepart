package com.wings.sparepart.product.Entity;

import jakarta.persistence.*;
import lombok.*;

import java.util.Date;
@Entity
@Table(name = "ProductionEntry")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Data
public class ProductionEntry {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column
    private Long productCode ;
    @Column
    private String productName ;
    @Column
    private String brand ;
    @Column
    private String productDescription ;
    @Column
    private Long productImageId ;
    @Column
    private Date date ;
    @Column
    private boolean status ;
}
