package com.wimg.sparepart.order.Repository;

import com.wimg.sparepart.order.Entity.OrderEntry;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderRepository extends JpaRepository<OrderEntry ,Long> {
}
