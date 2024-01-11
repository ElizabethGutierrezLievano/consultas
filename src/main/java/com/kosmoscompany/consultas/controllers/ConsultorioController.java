/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.kosmoscompany.consultas.controllers;

import com.kosmoscompany.consultas.entities.CConsultorios;
import com.kosmoscompany.consultas.services.ConsultoriosServiceImpl;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ConsultorioController {
        @Autowired
    private ConsultoriosServiceImpl consultoriosService;
    
    @GetMapping(value = "/consultorio/listar")
    public List<CConsultorios> getCitas(){
        return consultoriosService.getConsultoriosLista();
    }
}
