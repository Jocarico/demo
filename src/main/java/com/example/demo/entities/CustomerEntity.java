package com.example.demo.entities;

import javax.persistence.*;

@Entity

public class CustomerEntity {

    @Id
    @GeneratedValue(strategy= GenerationType.SEQUENCE, generator= "customer_seq_gen")
    @SequenceGenerator(name="customer_seq_gen", sequenceName = "customer_id_seq", allocationSize = 1)
    @Column(name="id")
    private Integer id;

    @Column(name="city", columnDefinition = "varchar(20)", nullable = false)
    private String city;

    @Column(name="first_name", columnDefinition = "varchar(60)", nullable = false)
    private String firstName;

    @Column(name = "last_name", columnDefinition = "varchar(60)", nullable = false)
    private String lastName;


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

}
