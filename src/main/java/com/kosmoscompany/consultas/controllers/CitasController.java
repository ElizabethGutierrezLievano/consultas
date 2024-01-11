/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.kosmoscompany.consultas.controllers;

import com.kosmoscompany.consultas.entities.TxCitas;
import com.kosmoscompany.consultas.services.CitasServiceImpl;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author 
 */
@RestController
public class CitasController {
    
    @Autowired
    private CitasServiceImpl citasService;
    
    @GetMapping(value = "/citas/listar")
    public List<TxCitas> getCitas(){
        return citasService.getCitasLista();
    }
    
}
