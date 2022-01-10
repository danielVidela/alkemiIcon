/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.alkemy.icon.mapper;

import com.alkemy.icon.dto.IconDTO;
import com.alkemy.icon.entity.IconEntity;
import java.util.ArrayList;
import java.util.List;
import org.springframework.stereotype.Component;

/**
 *
 * @author net
 */
@Component
public class IconMapper {
    public IconEntity iconDTO2Entity(IconDTO dto){
        IconEntity iconEntity = new IconEntity();
        iconEntity.setImagen(dto.getImagen());
        iconEntity.setDenominacion(dto.getDenominacion());
        iconEntity.setFechaCreacion(dto.getFechaCreacion());
        iconEntity.setAltura(dto.getAltura());
        iconEntity.setHistoria(dto.getHistoria());
        iconEntity.setPaises(dto.getPaises());
        return iconEntity;
    }
    public IconDTO iconEntity2DTO(IconEntity entity){
        IconDTO dto =new IconDTO();
        dto.setId(entity.getId());
        dto.setImagen(entity.getImagen());
        dto.setDenominacion(entity.getDenominacion());
        dto.setFechaCreacion(entity.getFechaCreacion());
        dto.setAltura(entity.getAltura());
        dto.setHistoria(entity.getHistoria());
        dto.setPaises(entity.getPaises());
        return dto;
    }
    public List<IconDTO> iconEntityList2DTOList(List<IconEntity> entities){
    List<IconDTO> dtos = new ArrayList<>();
    for (IconEntity entity : entities){
    dtos.add(this.iconEntity2DTO(entity));
    }
    return dtos;
    }
    
}
