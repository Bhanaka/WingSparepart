package com.wimg.sparepart.basicModule.Service;

import com.wimg.sparepart.basicModule.DTO.ProductEntryRequest;
import com.wimg.sparepart.basicModule.Entity.ProductionEntry;
import com.wimg.sparepart.basicModule.Repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ProductService {
    @Autowired
    ProductRepository productRepository ;
    public ProductionEntry save(ProductEntryRequest productEntryRequest) {
        ProductionEntry productionEntry =new ProductionEntry();
        productionEntry.setProductCode(Long.valueOf(productEntryRequest.getProductCode()));
        productionEntry.setProductName(productEntryRequest.getProductName());
        productionEntry.setBrand(productEntryRequest.getProductBrand());
        productionEntry.setProductDescription(productEntryRequest.getProductDescription());
        return productRepository.save(productionEntry);
    }

    public List<ProductionEntry> getAllProduct() {
        return productRepository.findAll();
    }

    public Optional<ProductionEntry> getProductByCode(Long productCode) {
        return productRepository.findByProductCode(productCode);
    }
}
