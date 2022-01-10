/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.alkemy.icon.controller;

import com.alkemy.icon.dto.IconDTO;
import com.alkemy.icon.service.IconService;
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
@RequestMapping("icon")
public class IconController {

    @Autowired
    private IconService iconService;

    @GetMapping
    public ResponseEntity<List<IconDTO>> getAll() {
        List<IconDTO> icon = iconService.getAllIcons();
        return ResponseEntity.ok().body(icon);

    }

    @PostMapping
    public ResponseEntity<IconDTO> save(@RequestBody IconDTO icon) {
        IconDTO iconGuardado = iconService.save(icon);
        return ResponseEntity.status(HttpStatus.CREATED).body(iconGuardado);
    }
}
