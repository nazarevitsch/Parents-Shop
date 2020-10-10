package com.bida.shop.domain;

import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;

@Entity
@Table(name = "colors")
public class Color {

    @Id
    @GeneratedValue(generator = "increment")
    @GenericGenerator(name = "increment", strategy = "increment")
    @Column(name = "id")
    private long id;

    @Column(name = "product_id")
    private int productId;

    @Column(name = "color_name")
    private String colorName;

    @Column(name = "color_number")
    private String colorNumber;

    public Color() {
    }

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

    @Override
    public String toString() {
        return "Color{" +
                "id=" + id +
                ", productId=" + productId +
                ", colorName='" + colorName + '\'' +
                ", colorNumber='" + colorNumber + '\'' +
                '}';
    }
}
