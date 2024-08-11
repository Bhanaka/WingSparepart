package com.wings.sparepart.product.Repository;

import com.wings.sparepart.product.Entity.ProductionCategoryEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductCategoryRepository extends JpaRepository<ProductionCategoryEntity,Long> {
}
