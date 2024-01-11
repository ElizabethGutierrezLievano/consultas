/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.kosmoscompany.consultas.services;

import com.kosmoscompany.consultas.entities.CPacientes;
import com.kosmoscompany.consultas.repositories.CPacientesRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PacientesServiceImpl {
    
    @Autowired
    private CPacientesRepository pacientesRep;
    
    public List<CPacientes> getPacientesLista(){
        return pacientesRep.findAll();
    }
}
