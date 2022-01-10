/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.alkemy.icon.dto;

import com.alkemy.icon.entity.PaisEntity;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import lombok.Getter;
import lombok.Setter;

/**
 *
 * @author net
 */
@Getter
@Setter
public class IconDTO {
    private Long id;
    private String imagen;
    private String denominacion;
    private LocalDate fechaCreacion;
    private Long altura;
    private String historia;
    private List<PaisEntity> paises =new ArrayList<>();
                
      

}
