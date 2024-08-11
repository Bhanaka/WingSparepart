package com.wings.sparepart.product.DTO;

import lombok.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Getter
@Setter
public class ProductCatoReq {
    private String categoryDes ;
    private Integer categoryCode ;
}
