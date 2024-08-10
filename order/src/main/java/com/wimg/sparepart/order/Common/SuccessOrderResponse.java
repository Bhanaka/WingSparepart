package com.wimg.sparepart.order.Common;

import com.wimg.sparepart.order.Entity.OrderEntry;
import lombok.Getter;

@Getter
public class SuccessOrderResponse implements OrderResponse{
    private final OrderEntry orderEntry;

    public SuccessOrderResponse(OrderEntry orderEntry) {
        this.orderEntry = orderEntry;
    }
}
