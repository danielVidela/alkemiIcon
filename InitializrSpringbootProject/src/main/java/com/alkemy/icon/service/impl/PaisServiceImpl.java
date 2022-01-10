/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.alkemy.icon.service.impl;

import com.alkemy.icon.dto.PaisDTO;
import com.alkemy.icon.entity.PaisEntity;
import com.alkemy.icon.mapper.PaisMapper;
import com.alkemy.icon.repository.PaisRepository;
import com.alkemy.icon.service.PaisService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author net
 */
@Service
public class PaisServiceImpl implements PaisService{
    
    @Autowired
    private PaisMapper paisMapper;
    @Autowired PaisRepository paisRepository;
    
    public PaisDTO save(PaisDTO dto){
        PaisEntity entity = paisMapper.paisDTO2Entity(dto);
        PaisEntity entitySaved =paisRepository.save(entity);
        PaisDTO result = paisMapper.paisEntity2DTO(entitySaved);
        return result;
    }
    public List<PaisDTO> getAllPaises(){
        List<PaisEntity> entities= paisRepository.findAll();
        List<PaisDTO> result =paisMapper.paisEntityList2DTOList(entities);
        return null;
    }
    
    
    
    
    
    
}
