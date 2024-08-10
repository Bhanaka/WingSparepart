package com.wimg.sparepart.basicModule.DTO;

import lombok.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Getter
@Setter
public class ProductEntryRequest {
    private Integer productCode ;
    private String productName ;
    private String productBrand ;
    private String productDescription ;
    private String productImagePath ;
    private boolean productStatus ;
}
