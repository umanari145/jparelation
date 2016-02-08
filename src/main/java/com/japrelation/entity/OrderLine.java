/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.japrelation.entity;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

/**
 *
 * @author matsumoto
 */
@Entity
@Table(name = "order_line")
public class OrderLine implements Serializable {

    @Id
    @GeneratedValue
    private Long id;

    private Integer quantity;

    @ManyToOne(targetEntity = Product.class)
    @JoinColumn(name="product_id",referencedColumnName = "id")
    private Product product;
    
    /**
     * @return the id
     */
    public Long getId() {
        return id;
    }

    /**
     * @param id the id to set
     */
    public void setId(Long id) {
        this.id = id;
    }

        /**
     * @return the quantity
     */
    public Product getProduct() {
        return product;
    }

    /**
     * @param quantity the quantity to set
     */
    public void setProduct(Product product) {
        this.product = product;
    }
    
    /**
     * @return the quantity
     */
    public Integer getQuantity() {
        return quantity;
    }

    /**
     * @param quantity the quantity to set
     */
    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }
}
