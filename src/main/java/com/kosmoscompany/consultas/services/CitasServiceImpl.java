/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.kosmoscompany.consultas.services;

import com.kosmoscompany.consultas.entities.TxCitas;
import com.kosmoscompany.consultas.repositories.TxCitasRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author 
 */
@Service
public class CitasServiceImpl {
    @Autowired
    private TxCitasRepository citasRep;
    
    public List<TxCitas> getCitasLista(){
        return citasRep.findAll();
    }
}
