/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.alkemy.icon.controller;

import com.alkemy.icon.dto.ContinenteDTO;
import com.alkemy.icon.service.ContinenteService;
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
@RequestMapping("continentes")
public class ContinenteController {
    
    @Autowired
    private ContinenteService continenteService;
    
    @GetMapping
    public ResponseEntity<List<ContinenteDTO>> getAll(){
        List<ContinenteDTO> continentes = continenteService.getAllContinentes();
        return ResponseEntity.ok().body(continentes);
        
    }
    
    @PostMapping
    public ResponseEntity<ContinenteDTO> save(@RequestBody ContinenteDTO continente){
        ContinenteDTO continenteGuardado = continenteService.save(continente);
        return ResponseEntity.status(HttpStatus.CREATED).body(continenteGuardado);
    }
}