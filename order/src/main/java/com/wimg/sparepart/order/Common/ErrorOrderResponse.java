package com.wimg.sparepart.order.Common;

import lombok.Getter;

@Getter
public class ErrorOrderResponse implements OrderResponse{
    private final String errorMessage ;

    public ErrorOrderResponse(String errorMessage) {
        this.errorMessage = errorMessage;
    }
}