package com.gg.simpleproductpage.controller;

import com.gg.simpleproductpage.dto.ProductDto;
import com.gg.simpleproductpage.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
public class ProductListController {

    @Autowired
    ProductService productService;

    @GetMapping(value = "/products")
    public ResponseEntity<List<ProductDto>> getProductList(){
        return ResponseEntity.ok(productService.getProductList());
    }

    @GetMapping(value = "/products/{id}")
    public ResponseEntity<List<ProductDto>> getProduct(@PathVariable int id){
        return ResponseEntity.ok(productService.getProduct(id));
    }

    /*@GetMapping("/get-product-list/get")
    public ResponseEntity<List<ProductDto>> getProduct(@RequestParam int id){
        return ResponseEntity.ok(productService.getProduct(id));
    }*/

}
