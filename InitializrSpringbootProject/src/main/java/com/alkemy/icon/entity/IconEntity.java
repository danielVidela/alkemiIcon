/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.alkemy.icon.entity;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.Table;
import lombok.Getter;
import lombok.Setter;
import org.springframework.format.annotation.DateTimeFormat;

/**
 *
 * @author net
 */
@Entity
@Table(name="icon")
@Getter
@Setter

public class IconEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Long id;
    private String imagen;
    private String denominacion;
    
    @Column(name="fecha_creacion")
    @DateTimeFormat(pattern = "yyyy/mm/dd")
    private LocalDate fechaCreacion;
    
    private Long altura;
    
    private String historia;
    
    
    @ManyToMany(mappedBy = "icons", cascade = CascadeType.ALL)
    private List<PaisEntity> paises =new ArrayList<>();
    
    //Add and remove paises
    public void addPais(PaisEntity pais){this.paises.add(pais);}
    
    public void removePais(PaisEntity pais){this.paises.remove(pais);}
     
}
