/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.alkemy.icon.service.impl;

import com.alkemy.icon.dto.ContinenteDTO;
import com.alkemy.icon.entity.ContinenteEntity;
import com.alkemy.icon.mapper.ContinenteMapper;
import com.alkemy.icon.repository.ContinenteRepository;
import com.alkemy.icon.service.ContinenteService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author net
 */
@Service
public class ContinenteServiceImpl implements ContinenteService {
    
    @Autowired
    private ContinenteMapper continenteMapper;
    @Autowired
    private ContinenteRepository continenteRepository;
    
    public ContinenteDTO save(ContinenteDTO dto){
        ContinenteEntity entity = continenteMapper.continenteDTO2Entity(dto);
        ContinenteEntity entitySaved = continenteRepository.save(entity);
        ContinenteDTO result = continenteMapper.continenteEntity2DTO(entitySaved);
        return result;
    }

   
    public List<ContinenteDTO> getAllContinentes() {
        List<ContinenteEntity> entities = continenteRepository.findAll();
        List<ContinenteDTO> result = continenteMapper.continenteEntityList2DTOList(entities);
       return null;
    }
}
