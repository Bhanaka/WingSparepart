package com.wimg.sparepart.basicModule.Repository;

import com.wimg.sparepart.basicModule.Entity.ProductionEntry;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface ProductRepository extends JpaRepository<ProductionEntry ,Long> {
    Optional<ProductionEntry> findByProductCode(Long productCode);
}
