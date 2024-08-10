package com.wimg.sparepart.inventory.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/inventory")
public class InventoryController {
    @GetMapping("/test")
    public String test(){
        return "this is a inventory module ";
    }
}
