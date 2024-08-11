package com.wings.sparepart.product.DTO;

import lombok.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Getter
@Setter
public class ProductSubCatoReq {
    private Integer subCategoryCode ;
    private String subCategoryDes ;

}
