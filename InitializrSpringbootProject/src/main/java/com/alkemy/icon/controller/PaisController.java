/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.alkemy.icon.controller;

import com.alkemy.icon.dto.PaisDTO;
import com.alkemy.icon.service.PaisService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author net
 */
@RestController
@RequestMapping("pais")
public class PaisController {
     @Autowired
    private PaisService paisService;
    
    @GetMapping
    public ResponseEntity<List<PaisDTO>> getAll(){
        List<PaisDTO> paises = paisService.getAllPaises();
        return ResponseEntity.ok().body(paises);
        
    }
    
    @PostMapping
    public ResponseEntity<PaisDTO> save(@RequestBody PaisDTO pais){
        PaisDTO paisGuardado = paisService.save(pais);
        return ResponseEntity.status(HttpStatus.CREATED).body(paisGuardado);
    }
}
