package edu.miu.cs.cs489.lab1;

import java.time.LocalDate;

public class Product {
    private Long productId;
    private String name;
    private LocalDate dateSupplied;
    private Integer quantityInStock;
    private Double unitPrice;

    // all args constructor
    public Product(Long productId, String name, LocalDate dateSupplied, Integer quantity, Double unit) {
        this.productId = productId;
        this.name = name;
        this.dateSupplied = dateSupplied;
        this.quantityInStock = quantity;
        this.unitPrice = unit;
    }

    // no args
    public Product() {
        this(null, null, null, null, null);
    }

    // one args
    public Product(String name) {
        this(null, name, null, null, null);
    }

    public Long getproductId() {
        return this.productId;
    }

    public void setProductId(Long productId) {
        this.productId = productId;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Long getProductId() {
        return productId;
    }

    public String getName() {
        return name;
    }

    public LocalDate getDateSupplied() {
        return dateSupplied;
    }

    public Integer getQuantityInStock() {
        return quantityInStock;
    }

    public Double getUnitPrice() {
        return unitPrice;
    }

    public void setDateSupplied(LocalDate dateSupplied) {
        this.dateSupplied = dateSupplied;
    }

    public void setquantityInStock(Integer quantityInStock) {
        this.quantityInStock = quantityInStock;
    }

    public void setUnitPrice(Double unitPrice) {
        this.unitPrice = unitPrice;
    }

    @Override
    public String toString() {
        return "{productId:" + productId + ", name:" + name + ", dateSupplied:" + dateSupplied
                + ", quantityInStock:" + quantityInStock + ", unitPrice:" + unitPrice + "}";
    }
}