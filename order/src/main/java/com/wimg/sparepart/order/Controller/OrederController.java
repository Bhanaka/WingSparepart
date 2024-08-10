package com.wimg.sparepart.order.Controller;

import com.wimg.sparepart.basicModule.DTO.OrderEventDTO;
import com.wimg.sparepart.order.Common.OrderResponse;
import com.wimg.sparepart.order.DTO.OrderEntryRequest;
import com.wimg.sparepart.order.Entity.OrderEntry;
import com.wimg.sparepart.order.KafkaConfig.OrderProducer;
import com.wimg.sparepart.order.Service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/order")
public class OrederController {
    @Autowired
    private OrderService orderService ;
    @Autowired
    private OrderProducer orderProducer ;
    @GetMapping("/test")
    public String test(){
        return orderService.test();
    }
    @PostMapping("/insertorder")
    public OrderResponse insertOrder(@RequestBody OrderEntryRequest orderEntryRequest){
        OrderEventDTO orderEventDTO =new OrderEventDTO();
        orderEventDTO.setMessage("order is commited");
        orderEventDTO.setStatus("pending");
        orderProducer.sentMessage(orderEventDTO);
        return  orderService.save(orderEntryRequest);
    }
}
