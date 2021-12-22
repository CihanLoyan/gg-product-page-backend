package com.gg.simpleproductpage.service.impl;

import com.gg.simpleproductpage.controller.ProductListController;
import com.gg.simpleproductpage.dto.ProductDto;
import com.gg.simpleproductpage.service.ProductService;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class ProductServiceImpl implements ProductService {

    @Value("${product.id}")
    public Integer productId;

    @Value("${product.title}")
    public String productTitle;

    @Value("${product.price}")
    public Integer productPrice;

    @Value("${product.description}")
    public String productDescription;

    @Value("${product.image}")
    public String productImage;

    @Value("${product2.id}")
    public Integer product2Id;

    @Value("${product2.title}")
    public String product2Title;

    @Value("${product2.price}")
    public Integer product2Price;

    @Value("${product2.description}")
    public String product2Description;

    @Value("${product2.image}")
    public String product2Image;

    @Override
    public List<ProductDto> getProductList() {

        List<ProductDto> productList = new ArrayList<>();

        ProductDto productDto = new ProductDto();
        ProductDto productDto2 = new ProductDto();

        productDto.setId(productId);
        productDto.setTitle(productTitle);
        productDto.setPrice(productPrice);
        productDto.setDescription(productDescription);
        productDto.setImage(productImage);

        productDto2.setId(product2Id);
        productDto2.setTitle(product2Title);
        productDto2.setPrice(product2Price);
        productDto2.setDescription(product2Description);
        productDto2.setImage(product2Image);

        productList.add(productDto);
        productList.add(productDto2);
        return productList;
    }

    @Override
    public List<ProductDto> getProduct(int id) {
        List<ProductDto> product = getProductList().stream()
                .filter(p -> p.getId() == id)
                .collect(Collectors.toList());
        return product;
    }

}
