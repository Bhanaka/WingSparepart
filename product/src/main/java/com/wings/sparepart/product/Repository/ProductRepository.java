package com.wings.sparepart.product.Repository;

import com.wings.sparepart.product.Entity.ProductionEntry;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface ProductRepository extends JpaRepository<ProductionEntry,Long> {
    Optional<ProductionEntry> findByProductCode(Long productCode);
}
