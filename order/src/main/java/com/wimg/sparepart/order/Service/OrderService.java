package com.wimg.sparepart.order.Service;

import com.wimg.sparepart.order.Common.ErrorOrderResponse;
import com.wimg.sparepart.order.Common.OrderResponse;
import com.wimg.sparepart.order.Common.SuccessOrderResponse;
import com.wimg.sparepart.order.DTO.OrderEntryRequest;
import com.wimg.sparepart.order.Entity.OrderEntry;
import com.wimg.sparepart.order.Repository.OrderRepository;
import com.wimg.sparepart.basicModule.Entity.ProductionEntry;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.reactive.function.client.WebClient;

@Service
public class OrderService {
    @Autowired
    private OrderRepository orderRepository ;
    private final WebClient webClient ;

    public OrderService(WebClient webClient) {

        this.webClient = webClient;
    }
    public OrderResponse save(OrderEntryRequest orderEntryRequest){
        try{
            ProductionEntry response =webClient.get()
                    .uri("http://localhost:8082/api/product/by-code?productCode=1001")
                    .retrieve()
                    .bodyToMono(ProductionEntry.class)
                    .block();
            assert response !=null;
             if(response.getProductCode()!= null){
                 OrderEntry orderEntry =new OrderEntry();
                 orderEntry.setOrderCode(orderEntryRequest.getOrderCode());
                 orderEntry.setProductCode(orderEntryRequest.getProductCode());
                 orderEntry.setPrice(orderEntryRequest.getPrice());
                 orderRepository.save(orderEntry) ;
                 return new SuccessOrderResponse(orderEntry);
             }else{
                 return new ErrorOrderResponse("product not availble");
             }
        }catch (Exception e){
            e.printStackTrace();
        }
      return null;
    }
    public String test(){
        // create web client
        try{
//            return "this is a order module ";

//            String testValue = webClient.get()
//                    .uri("http://localhost:8082/api/product/test")
//                    .retrieve()
//                    .bodyToMono()
//                    .block();
//            if (testValue!=null){
//                return "fucj";
//            }
        }catch (Exception e){
            e.printStackTrace();
        }
        return null ;
    }
}
