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
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;
import lombok.Getter;
import lombok.Setter;

/**
 *
 * @author matsumoto
 */
@Entity
@Table(name = "artist")
public class Artist implements Serializable{
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id")
    @Getter
    @Setter
    private Integer id;
    
    @Getter
    @Setter    
    @Column(name = "first_name")
    private String firstName;
    
    @Getter
    @Setter
    @Column(name = "last_name")
    private String lastName;
    
    @ManyToMany
    @JoinTable(name="jnd_art_cd", joinColumns = @JoinColumn( name = "artist_id"),
            inverseJoinColumns = @JoinColumn(name="cd_id"))
    private List<Cd> cdList;
    
}
