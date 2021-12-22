package com.gg.simpleproductpage.dto;


import java.util.List;

public class ProductDto {
    private Integer id;
    private String title;
    private Integer price;
    private String description;
    private String image;

    public Integer getId() {return id;}

    public void setId(Integer id) {this.id = id;}

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Integer getPrice() {
        return price;
    }

    public void setPrice(Integer price) {
        this.price = price;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

}
