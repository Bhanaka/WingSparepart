package com.wimg.sparepart.product.Controller;

import com.wings.sparepart.product.DTO.ProductEntryRequest;
import com.wings.sparepart.product.Entity.ProductionEntry;
import com.wings.sparepart.product.Service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/product")
public class ProductController {
    @Autowired
    ProductService productService ;
    @GetMapping("/test")
    public String test(){
//        System.out.println("ok");
        return "this is a product module";
    }
    @PostMapping("/insertproduct")
    public ProductionEntry insertProduct(@RequestBody ProductEntryRequest productEntryRequest){
        return productService.save(productEntryRequest) ;
//        return productEntryRequest ;
    }
    @GetMapping("/getallproduct")
    public List<ProductionEntry> getAllProduct(){
        return productService.getAllProduct();
    }
    @GetMapping("/by-code")
    public Optional<ProductionEntry> getProductByCode(@RequestParam Long productCode) {
        return productService.getProductByCode(productCode);
    }
}
