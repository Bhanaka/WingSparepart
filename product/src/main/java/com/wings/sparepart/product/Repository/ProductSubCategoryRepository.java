package com.wings.sparepart.product.Repository;

import com.wings.sparepart.product.Entity.ProductionSubCategoryEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductSubCategoryRepository extends JpaRepository<ProductionSubCategoryEntity ,Long > {
}
