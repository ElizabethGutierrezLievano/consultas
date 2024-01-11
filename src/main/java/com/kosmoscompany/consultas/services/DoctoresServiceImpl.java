/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.kosmoscompany.consultas.services;

import com.kosmoscompany.consultas.entities.CDoctores;
import com.kosmoscompany.consultas.repositories.CDoctoresRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class DoctoresServiceImpl {
    @Autowired
    private CDoctoresRepository doctoresRep;
    
    public List<CDoctores> getDoctoresLista(){
        return doctoresRep.findAll();
    }

    public CDoctores getDoctoresByNombre(String nombre){
        return doctoresRep.findByDoctoresNombres(nombre).orElse(new CDoctores());
    }
}
