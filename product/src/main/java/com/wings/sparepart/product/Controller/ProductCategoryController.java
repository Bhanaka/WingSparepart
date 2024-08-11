package com.wings.sparepart.product.Controller;

import com.wings.sparepart.product.DTO.ProductCatoReq;
import com.wings.sparepart.product.DTO.ProductSubCatoReq;
import com.wings.sparepart.product.Entity.ProductionCategoryEntity;
import com.wings.sparepart.product.Entity.ProductionSubCategoryEntity;
import com.wings.sparepart.product.Service.ProductCategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/product/Category")
public class ProductCategoryController {
    @Autowired
    ProductCategoryService productCategoryService ;
    //create the product category
    @PostMapping("/create")
    public ProductionCategoryEntity createCategory(@RequestBody ProductCatoReq productCatoReq){
        return productCategoryService.saveCategory(productCatoReq);
    }
    //get all product category
    @GetMapping("/getAllCategory")
    public List<ProductionCategoryEntity> getAllCategory(){
        return productCategoryService.getAllCatogory();
    }
    //get the specific entity by id or other
    @GetMapping("/getcategory/{id}")
    public ResponseEntity<ProductionCategoryEntity> getCategoryById(@PathVariable Long id){
        try {
            ProductionCategoryEntity productCategory = productCategoryService.getProductCategoryById(id);
            return new ResponseEntity<>(productCategory ,HttpStatus.OK) ;
        }catch (RuntimeException e){
            return new ResponseEntity<>(null, HttpStatus.NOT_FOUND);
        }
    }
    //update the specific entity by id
    @PutMapping("update/{id}")
    public ResponseEntity <ProductionCategoryEntity> updateCategory(
            @PathVariable Long id , @RequestBody ProductCatoReq productCatoReq){
        try {
            ProductionCategoryEntity updated = productCategoryService.updateCategory(id, productCatoReq);
            return new ResponseEntity<>(updated, HttpStatus.OK);
        } catch (RuntimeException e) {
            return new ResponseEntity<>(null, HttpStatus.NOT_FOUND);
        }
    }
    // create sub category
    @PostMapping("/subcategory/create")
    public ProductionSubCategoryEntity createSubCatgory(@RequestBody ProductSubCatoReq productSubCatoReq){
        return  productCategoryService.saveSubCategory(productSubCatoReq);
    }
    @GetMapping("/subcategory/getallsubcato")
    public List<ProductionSubCategoryEntity> getAllSubCato(){
        return productCategoryService.getAllSubCategory();
    }
    @GetMapping("/getsubcategory/{id}")
    public ResponseEntity <ProductionSubCategoryEntity>getSubCatoById(@PathVariable Long id){
        try {
            ProductionSubCategoryEntity productSubCategory = productCategoryService.getProductSubCategoryById(id);
            return new ResponseEntity<>(productSubCategory ,HttpStatus.OK) ;
        }catch (RuntimeException e){
            return new ResponseEntity<>(null, HttpStatus.NOT_FOUND);
        }
    }
}
