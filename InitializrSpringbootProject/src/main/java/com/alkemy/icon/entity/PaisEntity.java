/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.alkemy.icon.entity;

import java.util.HashSet;
import java.util.Set;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import lombok.Getter;
import lombok.Setter;

/**
 *
 * @author net
 */
@Entity
@Table(name="pais")
@Getter
@Setter
public class PaisEntity {
    @Id
    @Column
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Long id;
    
    private String imagen;
    
    private String denominacion;
    
    @Column(name="cant_habitantes")
    private Long cantidadHabitantes;
    
    private Long superficie; //m2
    
    @ManyToOne(fetch = FetchType.EAGER, cascade = CascadeType.ALL)
    @JoinColumn(name = "continente_id", insertable = false, updatable = false)
    private ContinenteEntity continente;
    
    @Column(name ="continente_id", nullable=false)
    private Long continenteId;
    
    @ManyToMany(
            cascade={
                CascadeType.PERSIST,
                CascadeType.MERGE,
            })
    @JoinTable(
            name="icon_pais",
            joinColumns = @JoinColumn(name ="pais_id"),
            inverseJoinColumns = @JoinColumn(name="icon_id"))
    private Set<IconEntity> icons = new HashSet<>();
    
    @Override
    public boolean equals(Object obj){
        if (obj == null)
            return false;
        if (getClass()!= obj.getClass())
            return false;
        final PaisEntity other=(PaisEntity) obj;
        return other.id == this.id;
        
    }
                
}
