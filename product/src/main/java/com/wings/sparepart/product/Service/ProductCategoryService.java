package com.wings.sparepart.product.Service;

import com.wings.sparepart.product.Common.CurrentDateTime;
import com.wings.sparepart.product.DTO.ProductCatoReq;
import com.wings.sparepart.product.DTO.ProductSubCatoReq;
import com.wings.sparepart.product.Entity.ProductionCategoryEntity;
import com.wings.sparepart.product.Entity.ProductionSubCategoryEntity;
import com.wings.sparepart.product.Repository.ProductCategoryRepository;
import com.wings.sparepart.product.Repository.ProductSubCategoryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ProductCategoryService {
    @Autowired
    ProductCategoryRepository productCategoryRepository ;
    @Autowired
    ProductSubCategoryRepository productSubCategoryRepository ;

    public ProductionSubCategoryEntity saveSubCategory(ProductSubCatoReq productSubCatoReq){
        ProductionSubCategoryEntity subCategory = new ProductionSubCategoryEntity();

        subCategory.setSubCategoryId(productSubCatoReq.getSubCategoryCode());
        subCategory.setSubSubCategoryDes(productSubCatoReq.getSubCategoryDes());

        subCategory.setDate(CurrentDateTime.getCurrentDateTime());

        subCategory.setStatus(true);

        return productSubCategoryRepository.save(subCategory) ;
    }
    public ProductionCategoryEntity saveCategory(ProductCatoReq productCatoReq){
        ProductionCategoryEntity productionCategoryEntity = new ProductionCategoryEntity() ;
        productionCategoryEntity.setCategoryId(productCatoReq.getCategoryCode());
        productionCategoryEntity.setCategoryDescription(productCatoReq.getCategoryDes());
        // get the current date and time
        String dateTime = CurrentDateTime.getCurrentDateTime() ;
        productionCategoryEntity.setStatus(true);
        productionCategoryEntity.setDate(dateTime);


        return productCategoryRepository.save(productionCategoryEntity);
    }

    public List<ProductionCategoryEntity> getAllCatogory() {
        return productCategoryRepository.findAll();
    }

    public ProductionCategoryEntity getProductCategoryById(Long id) {
        return productCategoryRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Production entity not found with id: " + id));
    }

    public ProductionCategoryEntity updateCategory(Long id, ProductCatoReq productCatoReq) {
        // Find the existing entity
        Optional<ProductionCategoryEntity> existingProductCato= productCategoryRepository.findById(id);
        if (existingProductCato.isPresent()) {
            ProductionCategoryEntity productCatoUpdate = existingProductCato.get();
            productCatoUpdate.setCategoryId(productCatoReq.getCategoryCode());
            productCatoUpdate.setCategoryDescription(productCatoReq.getCategoryDes());
            return productCategoryRepository.save(productCatoUpdate);
        } else {
            throw new RuntimeException("Production entity not found with id: " + id);
        }
    }

    public List<ProductionSubCategoryEntity> getAllSubCategory() {
        return productSubCategoryRepository.findAll();
    }

    public ProductionSubCategoryEntity getProductSubCategoryById(Long id) {
        return productSubCategoryRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Production entity not found with id: " + id));
    }
}
