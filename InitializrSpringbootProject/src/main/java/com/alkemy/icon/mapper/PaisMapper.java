/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.alkemy.icon.mapper;

import com.alkemy.icon.dto.PaisDTO;
import com.alkemy.icon.entity.PaisEntity;
import java.util.ArrayList;
import java.util.List;
import org.springframework.stereotype.Component;

/**
 *
 * @author net
 */
@Component
public class PaisMapper {
    public PaisEntity paisDTO2Entity(PaisDTO dto){
        PaisEntity paisEntity = new PaisEntity();
        paisEntity.setImagen(dto.getImagen());
        paisEntity.setDenominacion(dto.getDenominacion());
        paisEntity.setCantidadHabitantes(dto.getCantidadHabitantes());
        paisEntity.setSuperficie(dto.getSuperficie());
        paisEntity.setContinente(dto.getContinente());
        paisEntity.setContinenteId(dto.getContinenteId());
        paisEntity.setIcons(dto.getIcons());
        return paisEntity;
    }
    public PaisDTO paisEntity2DTO(PaisEntity entity){
        PaisDTO dto =new PaisDTO();
        dto.setId(entity.getId());
        dto.setImagen(entity.getImagen());
        dto.setDenominacion(entity.getDenominacion());
        dto.setCantidadHabitantes(entity.getCantidadHabitantes());
        dto.setSuperficie(entity.getSuperficie());
        dto.setContinente(entity.getContinente());
        dto.setContinenteId(entity.getContinenteId());
        dto.setIcons(entity.getIcons());
        return dto;
    }
    public List<PaisDTO> paisEntityList2DTOList(List<PaisEntity> entities){
    List<PaisDTO> dtos = new ArrayList<>();
    for (PaisEntity entity : entities){
    dtos.add(this.paisEntity2DTO(entity));
    }
    return dtos;
    }
}
