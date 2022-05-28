package com.example.demo.entities;


import javax.persistence.*;

@Entity
public class SupplierEntity {

    @Id
    @GeneratedValue(strategy= GenerationType.SEQUENCE, generator= "supplier_seq_gen")
    @SequenceGenerator(name="supplier_seq_gen", sequenceName = "supplier_id_seq", allocationSize = 1)
    @Column(name="id")
    private Integer id;

    @Column(name="total_cost", columnDefinition = "int", nullable = false)
    private Integer totalCost;

    @Column(name="product_name", columnDefinition = "varchar(60)", nullable = false)
    private String productName;

    @Column(name = "supplier_name", columnDefinition = "varchar(60)", nullable = false)
    private String supplierName;

    public SupplierEntity() {

    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getTotalCost() {
        return totalCost;
    }

    public void setTotalCost(Integer totalCost) {
        this.totalCost = totalCost;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public String getSupplierName() {
        return supplierName;
    }

    public void setSupplierName(String supplierName) {
        this.supplierName = supplierName;
    }

}
