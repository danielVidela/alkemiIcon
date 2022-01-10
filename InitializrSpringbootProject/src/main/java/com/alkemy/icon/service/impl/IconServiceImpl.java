/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.alkemy.icon.service.impl;

import com.alkemy.icon.dto.IconDTO;
import com.alkemy.icon.entity.IconEntity;
import com.alkemy.icon.mapper.IconMapper;
import com.alkemy.icon.repository.IconRepository;
import com.alkemy.icon.service.IconService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author net
 */
@Service
public class IconServiceImpl implements IconService{
    
    @Autowired
    private IconMapper iconMapper;
    @Autowired
    private IconRepository iconRepository;
    
    public IconDTO save(IconDTO dto){
        IconEntity entity = iconMapper.iconDTO2Entity(dto);
        IconEntity entitySaved= iconRepository.save(entity);
        IconDTO result = iconMapper.iconEntity2DTO(entitySaved);
        return result;   
    }
    public List<IconDTO> getAllIcons(){
        List<IconEntity> entities =iconRepository.findAll();
        List<IconDTO> result = iconMapper.iconEntityList2DTOList(entities);
        return null;
    }
    
    
    
    
    
    
}
