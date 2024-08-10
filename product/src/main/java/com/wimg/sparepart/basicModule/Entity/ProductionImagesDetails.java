package com.wimg.sparepart.basicModule.Entity;

import jakarta.persistence.*;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Entity
@Table(name = "ProductionImagesDetails")
@Data
@Setter
@Getter
@ToString

public class ProductionImagesDetails {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column()
    private String imagePath;
    @Column
    private boolean status ;

}
