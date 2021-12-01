package com.gg.simpleproductpage.controller;

import com.gg.simpleproductpage.dto.ProductDto;
import com.gg.simpleproductpage.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class ProductListController {

    @Autowired
    ProductService productService;

    @GetMapping(value = "/get-product-list")
    public ResponseEntity<List<ProductDto>> getProductList(){
        return ResponseEntity.ok(productService.getProductList());
    }
}
