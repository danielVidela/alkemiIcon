/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.alkemy.icon.dto;

import com.alkemy.icon.entity.ContinenteEntity;
import com.alkemy.icon.entity.IconEntity;
import java.util.HashSet;
import java.util.Set;
import lombok.Getter;
import lombok.Setter;

/**
 *
 * @author net
 */
@Getter
@Setter
public class PaisDTO {
    
    private Long id;
    
    private String imagen;
    
    private String denominacion;
    
    private Long cantidadHabitantes;
    
    private Long superficie; //m2
    
    private ContinenteEntity continente;
    
    private Long continenteId;
    
    private Set<IconEntity> icons = new HashSet<>();
    
    
    
    
}
