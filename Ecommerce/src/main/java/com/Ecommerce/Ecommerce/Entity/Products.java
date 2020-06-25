package com.Ecommerce.Ecommerce.Entity;

import javax.persistence.*;

@Entity
@Table(name="products")
public class Products {

        @Id
        @GeneratedValue(strategy= GenerationType.IDENTITY)
        @Column(name="productId")
        private int id;

        @Column(name="productName")
        private String productName;

        @Column(name="price")
        private int price;

        @Column(name="rating")
        private double rating;


    @ManyToOne(cascade= {CascadeType.PERSIST, CascadeType.MERGE,
            CascadeType.DETACH, CascadeType.REFRESH})
        @JoinColumn(name="categoryId")
        private Categories categories;

        public Products() {

        }

        public Products(String productName, int price, double rating) {
            this.productName = productName;
            this.price = price;
            this.rating = rating;
        }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public double getRating() {
        return rating;
    }

    public void setRating(double rating) {
        this.rating = rating;
    }

    public Categories getCategories() {
        return categories;
    }

    @Override
    public String toString() {
        return "Products{" +
                "productName='" + productName + '\'' +
                ", price=" + price +
                ", rating=" + rating +
                ", categories=" + categories +
                '}';
    }
}
