package com.wings.sparepart.product.Service;

import com.wings.sparepart.product.DTO.ProductEntryRequest;
import com.wings.sparepart.product.Entity.ProductionEntry;
import com.wings.sparepart.product.Repository.ProductRepository;
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
