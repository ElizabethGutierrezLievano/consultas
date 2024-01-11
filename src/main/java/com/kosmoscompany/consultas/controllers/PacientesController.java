/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.kosmoscompany.consultas.controllers;

import com.kosmoscompany.consultas.entities.CPacientes;
import com.kosmoscompany.consultas.services.PacientesServiceImpl;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PacientesController {
        @Autowired
    private PacientesServiceImpl pacientesService;
    
    @GetMapping(value = "/pacientes/listar")
    public List<CPacientes> getPacientes(){
        return pacientesService.getPacientesLista();
    }
}
