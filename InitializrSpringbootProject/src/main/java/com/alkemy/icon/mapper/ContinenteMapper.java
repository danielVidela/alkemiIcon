/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.alkemy.icon.mapper;

import com.alkemy.icon.dto.ContinenteDTO;
import com.alkemy.icon.entity.ContinenteEntity;
import java.util.ArrayList;
import java.util.List;
import org.springframework.stereotype.Component;

/**
 *
 * @author net
 */
@Component

public class ContinenteMapper {
    
    public ContinenteEntity continenteDTO2Entity(ContinenteDTO dto){
        ContinenteEntity continenteEntity = new ContinenteEntity();
        continenteEntity.setImagen(dto.getImagen());
        continenteEntity.setDenomination(dto.getDenominacion());
        return continenteEntity;
    }
    public ContinenteDTO continenteEntity2DTO(ContinenteEntity entity){
        ContinenteDTO dto = new ContinenteDTO();
        dto.setId(entity.getId());
        dto.setImagen(entity.getImagen());
        dto.setDenominacion(entity.getDenomination());
        return dto;
    }
    public List<ContinenteDTO> continenteEntityList2DTOList(List<ContinenteEntity> entities){
    List<ContinenteDTO> dtos = new ArrayList<>();
    for (ContinenteEntity entity : entities){
    dtos.add(this.continenteEntity2DTO(entity));
    }
    return dtos;
    }
       
    
}
