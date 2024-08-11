package com.wings.sparepart.product.Service;

import com.wings.sparepart.product.DTO.ProductSubCatoReq;
import com.wings.sparepart.product.Entity.ProductionSubCategoryEntity;
import org.springframework.stereotype.Service;

@Service
public class ProductCategoryService {
    public ProductionSubCategoryEntity save(ProductSubCatoReq productSubCatoReq){
        return new ProductionSubCategoryEntity() ;
    }
}
