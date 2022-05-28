package com.example.demo.entities;


import javax.persistence.*;

@Entity
public class ProductEntity {


    @Id
    @GeneratedValue(strategy= GenerationType.SEQUENCE, generator= "product_seq_gen")
    @SequenceGenerator(name="product_seq_gen", sequenceName = "product_id_seq", allocationSize = 1)
    @Column(name="id")
    private Integer id;

    @Column(name="product_name", columnDefinition = "varchar(40)", nullable = false)
    private String productName;

    @Column(name="product_brand", columnDefinition = "varchar(60)", nullable = false)
    private String productBrand;

    @Column(name = "product_cost", columnDefinition = "varchar(60)", nullable = false)
    private Integer productCost;

    public ProductEntity() {

    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {

        this.id = id;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public String getProductBrand() {
        return productBrand;
    }

    public void setProductBrand(String productBrand) {
        this.productBrand = productBrand;
    }

    public Integer getProductCost() {
        return productCost;
    }

    public void setProductCost(Integer productCost) {
        this.productCost = productCost;
    }

}
