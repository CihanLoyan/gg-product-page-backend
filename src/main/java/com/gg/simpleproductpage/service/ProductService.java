package com.gg.simpleproductpage.service;

import com.gg.simpleproductpage.dto.ProductDto;

import java.util.List;

public interface ProductService {
    List<ProductDto> getProductList();
    List<ProductDto> getProduct(int id);
}
