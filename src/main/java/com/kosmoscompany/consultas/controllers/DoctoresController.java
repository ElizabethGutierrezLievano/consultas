/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.kosmoscompany.consultas.controllers;

import com.kosmoscompany.consultas.entities.CDoctores;
import com.kosmoscompany.consultas.services.DoctoresServiceImpl;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DoctoresController {
    
        @Autowired
    private DoctoresServiceImpl doctoresService;
    
    @GetMapping(value = "/doctores/listar")
    public List<CDoctores> getDoctores(){
        return doctoresService.getDoctoresLista();
    }

    @GetMapping(value = "/doctores/bynombre")
    public ResponseEntity<CDoctores> getDoctores(@RequestParam String nombre){
        return new ResponseEntity<>(doctoresService.getDoctoresByNombre(nombre),HttpStatus.OK);
    }
}
