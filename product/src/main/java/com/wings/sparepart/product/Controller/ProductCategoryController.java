package com.wings.sparepart.product.Controller;

import com.wings.sparepart.product.DTO.ProductSubCatoReq;
import com.wings.sparepart.product.Entity.ProductionSubCategoryEntity;
import com.wings.sparepart.product.Service.ProductCategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/product/Category")
public class ProductCategoryController {
//    @Autowired
//    ProductSubCatoReq productSubCatoReq ;
    @Autowired
ProductCategoryService productCategoryService ;
    // create sub category
    @PostMapping("/subcategory/create")
    public ProductionSubCategoryEntity createSubCatgory(@RequestBody ProductSubCatoReq productSubCatoReq){
        return  productCategoryService.save(productSubCatoReq);
    }
}
