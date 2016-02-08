/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.japrelation.main;

import com.japrelation.entity.Artist;
import com.japrelation.entity.Cd;
import com.japrelation.entity.SampleOrder;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

/**
 *
 * @author matsumoto
 */
public class SampleFacade {
    
    private EntityManagerFactory fac;
    private EntityManager em;
    private EntityTransaction tx;
    
    public SampleFacade(){
        fac = Persistence.createEntityManagerFactory("com_japrelation_jar_1.0.0-SNAPSHOTPU");
        em = fac.createEntityManager();
        tx = em.getTransaction();
    }
   
    public List<SampleOrder> getAll(){
        return em.createQuery(" SELECT s FROM SampleOrder s ",SampleOrder.class).getResultList();
    }
    
    public List<Cd> getCdList(){
        return em.createQuery(" SELECT c FROM Cd c ",Cd.class).getResultList();
    }
    
    public List<Artist> getArtistList(){
        return em.createQuery(" SELECT a FROM Artist a ",Artist.class).getResultList();
    }
   
}
