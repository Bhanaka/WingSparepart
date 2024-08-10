package com.wimg.sparepart.order.DTO;

import lombok.*;

@Data
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class OrderEntryRequest {
    private Long orderCode ;
    private Long productCode;
    private double price ;
}
