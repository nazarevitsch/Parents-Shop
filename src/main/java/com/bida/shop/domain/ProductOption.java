package com.bida.shop.domain;

import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;

@Entity
@Table(name = "products_option")
public class ProductOption {

    @Id
    @GeneratedValue(generator = "increment")
    @GenericGenerator(name = "increment", strategy = "increment")
    @Column(name = "id")
    private long id;

    @Column(name = "product_id")
    private int productId;

    @Column(name = "size")
    private String size;

    @Column(name = "color_name")
    private String colorName;

    @Column(name = "color_number")
    private String colorNumber;

    public ProductOption(){}

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public int getProductId() {
        return productId;
    }

    public void setProductId(int productId) {
        this.productId = productId;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public String getColorName() {
        return colorName;
    }

    public void setColorName(String colorName) {
        this.colorName = colorName;
    }

    public String getColorNumber() {
        return colorNumber;
    }

    public void setColorNumber(String colorNumber) {
        this.colorNumber = colorNumber;
    }
}
