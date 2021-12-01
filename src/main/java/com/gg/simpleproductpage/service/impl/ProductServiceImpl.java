package com.gg.simpleproductpage.service.impl;

import com.gg.simpleproductpage.dto.ProductDto;
import com.gg.simpleproductpage.service.ProductService;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class ProductServiceImpl implements ProductService {

    @Override
    public List<ProductDto> getProductList() {
        List<ProductDto> productList = new ArrayList<>();
        ProductDto productDto = new ProductDto();

        productDto.setId(1);
        productDto.setTitle("example title");
        productDto.setDescription("example description");

        productList.add(productDto);
        return productList;
    }
}
