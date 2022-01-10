/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.alkemy.icon.service;

import com.alkemy.icon.dto.IconDTO;
import java.util.List;

/**
 *
 * @author net
 */
public interface IconService {
    IconDTO save (IconDTO dto);
    List<IconDTO> getAllIcons();
}