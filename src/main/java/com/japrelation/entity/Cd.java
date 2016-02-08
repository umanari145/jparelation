/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.japrelation.entity;

import java.io.Serializable;
import java.util.List;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.Table;
import lombok.Getter;
import lombok.Setter;

/**
 *
 * @author matsumoto
 */
@Entity
@Table(name = "cd")
public class Cd  implements Serializable {
    
    private static final long serialVersionUID = 1L;
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id")
    @Getter
    @Setter
    private Integer id;
    
    @Getter
    @Setter    
    @Column(name = "title")
    private String title;
    
    @Getter
    @Setter
    @Column(name = "price")
    private Integer price;
    
    @Getter
    @Setter
    @Column(name = "description")
    private String description;
    
    @ManyToMany( mappedBy = "cdList")
    private List<Artist> createdByArtists;    
    
}
