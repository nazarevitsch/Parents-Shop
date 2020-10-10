package com.bida.shop.domain;

import org.hibernate.annotations.Formula;
import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "products")
public class Product {

    @Id
    @GeneratedValue(generator = "increment")
    @GenericGenerator(name = "increment", strategy = "increment")
    @Column(name = "id")
    private long id;

    @Column(name = "category_id")
    private long categoryId;

    @Column(name = "name")
    private String name;

    @Column(name = "price")
    private int price;

    @Column(name = "price_wholesale")
    private int wholesalePrice;

    @Column(name = "description")
    private String description;

    @Column(name = "is_active")
    private boolean is_active;

    @Column(name = "main_image")
    private String mainImage;

@OneToMany
@JoinTable(
        name="sizes",
        joinColumns = @JoinColumn( name="product_id"),
        inverseJoinColumns = @JoinColumn( name="id"))
    private List<Size> sizes;

    @OneToMany
    @JoinTable(
            name="colors",
            joinColumns = @JoinColumn( name="product_id"),
            inverseJoinColumns = @JoinColumn( name="id"))
    private List<Color> colors;


    public Product(){}

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public long getCategory_id() {
        return categoryId;
    }

    public void setCategoryId(long categoryId) {
        this.categoryId = categoryId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getWholesalePrice() {
        return wholesalePrice;
    }

    public void setWholesalePrice(int wholesalePrice) {
        this.wholesalePrice = wholesalePrice;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public boolean isIs_active() {
        return is_active;
    }

    public void setIs_active(boolean is_active) {
        this.is_active = is_active;
    }

    public String getMainImage() {
        return mainImage;
    }

    public void setMainImage(String mainImage) {
        this.mainImage = mainImage;
    }

    public List<Size> getSizes() {
        return sizes;
    }

    public void setSizes(List<Size> sizes) {
        this.sizes = sizes;
    }

    public List<Color> getColors() {
        return colors;
    }

    public void setColors(List<Color> colors) {
        this.colors = colors;
    }

    @Override
    public String toString() {
        return "Product{" +
                "id=" + id +
                ", category_id=" + categoryId +
                ", name='" + name + '\'' +
                ", price=" + price +
                ", wholesalePrice=" + wholesalePrice +
                ", description='" + description + '\'' +
                ", is_active=" + is_active +
                ", main_image='" + mainImage + '\'' +
                ", sizes=" + sizes +
                ", colors=" + colors +
                '}';
    }
}
